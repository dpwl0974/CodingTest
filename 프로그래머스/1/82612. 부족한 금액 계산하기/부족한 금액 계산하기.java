class Solution {
    public long solution(int price, int money, int count) {
        long amount = 0;
        
        for(int i = 1; i <= count; i++){
            amount += price * i;
        }
        
        long answer = amount - money;

        return answer >= 0 ? answer : 0;
    }
}