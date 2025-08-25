class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(char c : s.toCharArray()){
            if(c == ' ') answer += ' ';
            else if(c >= 'A' && c <= 'Z') {
                char shifted = (char)(((c - 'A' + n) % 26) + 'A');
                answer += shifted;
            }
            else if(c >= 'a' && c <= 'z') {
                char shifted = (char)(((c - 'a' + n) % 26) + 'a');
                answer += shifted;
            }
        }
        return answer;
    }
}