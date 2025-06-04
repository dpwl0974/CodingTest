import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        int len = citations.length;
        
        
        for(int i = 0; i < len; i++){
            if(citations[i] >= len - i) { //나머지 논문(n-h)이 h번 이하 인용 중 최댓값
                answer = len - i;
                break;
            }
        }
        return answer;
    }
}