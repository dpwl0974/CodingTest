class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int[] work = new int[players.length + k]; // 반납 시간 저장
        int worker = 0; // 운영 중 서버
        
        for(int i = 0; i < players.length; i++) {
            worker -= work[i]; // 반납 된 서버 빼기
            
            int required = players[i] / m;
            
            if(required > worker) {
                int server = required - worker;
                answer += server;
                worker += server;
                work[i + k] += server;
            }            
        }
        return answer;
    }
}
