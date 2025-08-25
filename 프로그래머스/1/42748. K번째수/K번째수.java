import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for(int[] c : commands) {
            List<Integer> list = new ArrayList<>();
            
            for(int i = c[0] - 1; i < c[1]; i++){ // 분리
                list.add(array[i]);
            }
            
            Collections.sort(list); // 정렬
            answer.add(list.get(c[2] - 1)); // 값 저장
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}