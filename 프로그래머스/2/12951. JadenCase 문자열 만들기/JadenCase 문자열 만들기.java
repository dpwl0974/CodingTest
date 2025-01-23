class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        String answer = "";
        String temp = " " + s;
        
        for(int i = 1; i < temp.length(); i++){
            if(temp.charAt(i-1) == ' '){
                answer += Character.toUpperCase(temp.charAt(i));
            }
            else {
                answer += temp.charAt(i);
            }
        }

        return answer;
    }
}