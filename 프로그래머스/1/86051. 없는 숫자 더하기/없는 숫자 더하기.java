class Solution {
    public int solution(int[] numbers) {
        
        int[] num = new int[10];        
        for(int n : numbers){
            num[n] = 1;
        }
        
        int answer = 0;
        for(int i = 0; i <= 9; i++) {
            if(num[i] == 0) answer += i;
        }
        
        return answer;
    }
}