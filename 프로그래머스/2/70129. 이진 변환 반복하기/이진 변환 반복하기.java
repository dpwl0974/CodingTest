class Solution {
    public int[] solution(String s) {
        int cnt = 0; //변환 수
        int num = 0; //0의 수
        
        int temp1 = 0; //이전 길이
        int temp2 = 0; //0 지운 길이
        
        while(s.length() > 1)
        {
            temp1 = s.length();
            s = s.replace("0", "");
            temp2 = s.length();
            
            num += temp1 - temp2;
            
            s = Integer.toBinaryString(temp2);
            cnt++; 
        }
        
        return new int[] {cnt, num};
    }
}