import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++){  
            map.compute(clothes[i][1], (key, oldValue) -> (oldValue == null? 2: oldValue + 1));
        }
        
        for(int i : map.values()){
            answer *= i;
        } 
    
        return answer - 1;
    }
}