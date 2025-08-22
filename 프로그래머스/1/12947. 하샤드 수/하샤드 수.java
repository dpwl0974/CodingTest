class Solution {
    public boolean solution(int x) {
        int answer = 0;
        for(char c : String.valueOf(x).toCharArray()) {
            answer += c - '0';   // int형 변환
        }
        return x % answer == 0 ? true : false;
    }
}