// 맵 사용 (번호, 시간)
// 시간 * 60 후 계산
import java.util.*;

class Solution {
    
    int pullTime = (23 * 60) + 59;
    
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> chargeMap = new TreeMap<>(); // 차량 번호 순 정렬 가능
        
        for(String r : records) {
            String[] parts = r.split(" ");
            String car = parts[1], type = parts[2];
            int time = pullTime - timeToMin(parts[0]);
            
            chargeMap.merge(car, type.equals("IN") ? time : -time, Integer::sum);
        }
        
        return chargeMap.values()
                .stream()
                .mapToInt(time -> calculateFee(time, fees))
                .toArray();
    }
    
    // 요금 계산
    public int calculateFee (int time, int[] fees){
        if (time <= fees[0]) return fees[1];
        return fees[1] + (int) Math.ceil((time - fees[0]) / (double) fees[2]) * fees[3];
    }
    
    // 시간 변환
    public int timeToMin (String time){
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        return (hour * 60) + min;
    }
}