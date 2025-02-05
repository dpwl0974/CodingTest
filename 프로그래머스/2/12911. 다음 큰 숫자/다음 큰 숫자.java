class Solution {
    public int solution(int n) {
        int answer = n + 1;
        
        while(!comparison(n, answer)){
            answer++;
        }
        return answer;
    }
    
    public boolean comparison(int n, int answer){
        int num = Integer.bitCount(n);
        int len = Integer.bitCount(answer);
        
        return num == len ? true : false;
    }
}