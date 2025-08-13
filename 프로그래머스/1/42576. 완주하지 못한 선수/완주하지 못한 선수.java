import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        // 참가자 전원 추가
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 완주한 사람 제거
        for (String c : completion) {
            int n = map.get(c) - 1;
            if(n == 0) map.remove(c); //map에 존재하면 삭제 - 필요 없
            else map.put(c, n);
         }
        
        // 남은 1명이 완주하지 못한 선수
        return map.keySet().iterator().next();
    }
}