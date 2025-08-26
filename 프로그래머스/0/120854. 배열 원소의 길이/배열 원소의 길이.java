import java.util.*;
class Solution {
    public int[] solution(String[] strlist) {
        List<Integer> answer = new ArrayList<>();
        
        for(String s : strlist){
            answer.add(s.length());
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}