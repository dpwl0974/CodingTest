class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        
        for(String b : babbling){
            for(String w : word) {
                b = b.replace(w, " "); //연속된 발음 체크
            }
            b = b.replace(" ", "");
            if(b.isEmpty()) answer++;
        }
        return answer;
    }
}