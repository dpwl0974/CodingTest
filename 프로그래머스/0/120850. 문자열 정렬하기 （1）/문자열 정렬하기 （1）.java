import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)) {         
                answer.add(c - '0');            // '0'을 빼서 정수화
            }
        }
        
        Collections.sort(answer); 
        return answer.stream().mapToInt(x -> x).toArray();
    }
}