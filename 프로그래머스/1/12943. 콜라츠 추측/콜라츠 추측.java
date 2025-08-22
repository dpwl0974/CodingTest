class Solution {
    public int solution(int num) {
        long n = num; // 오버플로우로 인한 계산 오류 방지 (ex. -1 리턴이어야 하는데 488 리턴)
        int cnt = 0;
        
        if(n== 1) return 0;
        
        while(n != 1){
            if(n % 2 == 0) n = n / 2;
            else n = (n * 3) + 1;
            
            cnt++;
            if(cnt > 500) return -1;
        }

        return cnt;
    }
}