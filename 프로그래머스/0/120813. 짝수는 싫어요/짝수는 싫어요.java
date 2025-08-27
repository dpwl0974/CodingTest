import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1) list.add(i);
        }
        Collections.sort(list);
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}