class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;          //12
        
        for(int w = area; w > 1; w--){
            if(area % w == 0) {            //12, 6, 4, 3, 2
                int h = area / w;          //1, 2, 3, 4, 6
                
                if(w*2 + ((h-2) * 2) == brown) {
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            } 
        }
        return answer;
    }
}