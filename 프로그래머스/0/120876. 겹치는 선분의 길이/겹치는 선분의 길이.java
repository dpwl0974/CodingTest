class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        boolean[] check = new boolean[201]; 
        
        for(int i = 0; i < 3; i++){
            int start = lines[i][0];
            int end = lines[i][1];
            
            for(int j = start; j < end; j++){
                if(!check[j+100]) check[j+100] = true; 
                else { // true이면 겹침
                    answer++;
                    check[j+100] = false;
                }
            }
        }
        
        return answer;
    }
}