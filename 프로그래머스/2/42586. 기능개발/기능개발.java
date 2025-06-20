import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = progresses.length-1; i >= 0; i--){
            int day = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            stack.push(day);
        }
        
        while(!stack.isEmpty()){
            int checkday = stack.pop();
            int cnt = 1;
            
            while(!stack.isEmpty() && stack.peek() <= checkday){
                stack.pop();
                cnt++;
            }
            answer.add(cnt);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}