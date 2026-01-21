class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            int sqrt = (int) Math.sqrt(i);
            
            int count = divisor(i, sqrt);
            
            if(count % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
    
    public int divisor(int n, int sqrt){
        int count = 0;
        for(int i = 1; i <= sqrt; i++) {
            if(n % i == 0) {
                count++;            
                if(n / i != i) count++;
            }
        }
        return count;
    }
}