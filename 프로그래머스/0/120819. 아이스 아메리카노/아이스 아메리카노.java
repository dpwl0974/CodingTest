class Solution {
    public int[] solution(int money) {
        int cnt = 0;
        
        while(money >= 5500){
            
            if(money >= 5500) {
                money = money - 5500;
                cnt++;
            }
            else break;
        }
        return new int[]{cnt, money};
    }
}