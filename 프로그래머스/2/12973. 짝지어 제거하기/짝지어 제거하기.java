import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<String> stackStr = new Stack<>();
        String[] str = s.split("");
        
        for(int i = 0; i < str.length; i++){
            if(stackStr.isEmpty()) {
                stackStr.push(str[i]);
            }
            else if(stackStr.peek().equals(str[i])){
                stackStr.pop();
            }
            else{
                stackStr.push(str[i]);
            }
        }
        return stackStr.isEmpty() ? 1 : 0;
    }
}