import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        
        for(int a : arr) {
            if(a % divisor == 0) answer.add(a);
        }
        
        Collections.sort(answer);
        return answer.isEmpty() ? new int[]{-1} : answer.stream().mapToInt(x -> x).toArray();
    }
}