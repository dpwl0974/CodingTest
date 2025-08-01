class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(true){
            answer++;
            n = n - 7;
            if(n <= 0) break;
        }
        
        return answer;
    }
}