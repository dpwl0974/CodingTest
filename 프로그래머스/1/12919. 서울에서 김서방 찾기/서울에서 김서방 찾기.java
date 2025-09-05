class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int i = 0;
        
        for(String s : seoul){
            if(s.equals("Kim")) break;  // break 통해 배열 그만 돌며 효율성 업
            i++;
        }
        return "김서방은 " + i + "에 있다";
    }
}