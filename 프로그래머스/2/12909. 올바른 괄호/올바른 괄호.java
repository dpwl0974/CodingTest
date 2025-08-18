import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false; // 필수 : 비어있는데 삭제 할 수 없음
                stack.pop();
            }
        }
        
        return stack.isEmpty(); // 스택이 비어있으면 ture : 괄호 짝이 맞다
    }
}

/* class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') {
                cnt += 1;    
            }
            else if(s.charAt(i) == ')') {
                cnt -= 1;
            } 
            
            if(cnt < 0) {
                    break;
                }
        }
        
        if(cnt != 0) {
            answer = false;
        }
        
        return answer;
    }
} */
