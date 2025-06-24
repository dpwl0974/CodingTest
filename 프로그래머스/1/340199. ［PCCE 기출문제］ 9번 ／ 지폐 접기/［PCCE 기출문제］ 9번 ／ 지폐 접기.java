import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(check(wallet, bill)){
            if(bill[0] > bill[1]){
                bill[0] = bill[0] / 2;
            }
            else {
                bill[1] = bill[1] / 2;
            }
            answer++;
        }
        return answer;
    }
    
    public boolean check(int[] wallet, int[] bill) {
        int b_min = Math.min(bill[0], bill[1]);
        int b_max = Math.max(bill[0], bill[1]);
        int w_min = Math.min(wallet[0], wallet[1]);
        int w_max = Math.max(wallet[0], wallet[1]);
        
        return b_min > w_min || b_max > w_max ? true : false;
    }
}