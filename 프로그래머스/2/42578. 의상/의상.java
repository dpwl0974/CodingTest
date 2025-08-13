import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 1;
        
        for(String[] c: clothes)  {
            map.put(c[1], map.getOrDefault(c[1], 1) + 1);
        }       
        
        // 경우의 수 
        for(int i : map.values()) {
            answer *= i;
        }
        
        // 아무것도 안하는 값 빼기
        return answer - 1;
    }
}

/* import java.util.*;
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
*/
