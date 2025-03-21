import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int cnt = 0;
        
        List<Integer> intList = new ArrayList<>();
        int[] count = new int[10000001];
        
        //귤 크기별 갯수 세기
        for(int i = 0; i < tangerine.length; i++){
            count[tangerine[i]]++; 
        }
        
        //갯수 배열 생성
        for(int i = 0; i < count.length; i++){
            if(count[i] > 0) {
                intList.add(count[i]);
            }
        }
        
        //최솟값 찾기
        intList.sort(Collections.reverseOrder());
        for (int i = 0; i < intList.size(); i++) {
            cnt += intList.get(i);
            answer++;
            if (cnt >= k) {
                break;
            }
        }
        return answer;
    }
    
}