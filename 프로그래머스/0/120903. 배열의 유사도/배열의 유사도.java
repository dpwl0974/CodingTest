class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String s : s2){
            for(String i : s1) {
                if(s.equals(i)) answer++;
            }
        }
        return answer;
    }
}