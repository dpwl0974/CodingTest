import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int min = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
        }
        
        for(int i : arr) {
            if(i != min) answer.add(i);
        }
        if(answer.isEmpty()) answer.add(-1);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}