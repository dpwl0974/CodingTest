import java.util.*;
class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr); 
        
        //내림차순 위해
        //StringBuilder -> 수정 가능한 String
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();
        
        return Long.parseLong(sb.toString());
    }
      
}