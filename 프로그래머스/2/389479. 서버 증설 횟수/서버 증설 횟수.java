class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int[] work = new int[players.length + k]; // 퇴근 시간 저장
        int worker = 0; // 일하는 직원 수
        
        for(int i = 0; i < players.length; i++) {
            worker -= work[i]; // 퇴근하면 직원 수 빼기
            
            int required = players[i] / m;
            
            if(required > worker) {
                int hire = required - worker;
                answer += hire;
                worker += hire;
                work[i + k] += hire;
            }            
        }
        return answer;
    }
}