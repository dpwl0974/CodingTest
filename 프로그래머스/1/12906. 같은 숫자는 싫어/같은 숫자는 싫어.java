import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        Integer pre = null; // 이전 값 (아직 값 없으므로 Null)
        
        for(int a: arr){
            if(pre == null || a != pre) list.add(a);
            pre = a; // 이전 값 갱신
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}