import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
   
        for(int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>(); //괄호 담을 스택
            int turn = 0; //s 끝까지 돌았나 확인
            boolean isValid = true;
            
            for(int j = 0; j < s.length(); j++){
                turn++;
                if(s.charAt(j) == '[' || s.charAt(j) == '{' || s.charAt(j) == '('){
                    stack.push(s.charAt(j));
                }
                else{ //닫힌 괄호 짝 맞추기
                    char p = 'p';
                    if(s.charAt(j) == ']') p = '[';
                    else if(s.charAt(j) == '}') p = '{';
                    else if(s.charAt(j) == ')') p = '(';
                    
                    if(!stack.isEmpty() && p == stack.peek()) stack.pop();
                    else{
                        isValid = false;
                        break;
                    }
                }
            }    
            if(turn == s.length() && stack.isEmpty() && isValid) answer++; 
            s = rotation(s);
        } 
        return answer;
    }       
    
    public String rotation (String s) { //왼쪽 시프트 메소드
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i++){
            sb.append(s.charAt(i));
        }
        sb.append(s.charAt(0));
        
        s = sb.toString();
        return s;
    }
}

