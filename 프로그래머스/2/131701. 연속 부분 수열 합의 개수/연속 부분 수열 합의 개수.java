import java.util.*;
class Solution {
    public int solution(int[] elements) {
        //중복 제거를 위해 set 사용
        Set<Integer> set = new HashSet<>();
        
        //원형구조 반영하여 수열의 합 구하기
        for(int i = 0 ; i < elements.length ; i++){
            int answer = 0;
            for(int j = 0 ; j < elements.length ; j++){
                answer += elements[(i+j)%elements.length];
                set.add(answer);
            }
            //System.out.println(set);
        }
        return set.size();
    }
}