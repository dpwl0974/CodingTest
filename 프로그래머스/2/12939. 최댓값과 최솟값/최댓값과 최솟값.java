class Solution {
    public String solution(String s) {
        String answer = "";
        String [] arr = s.split(" ");
        
        int min = Integer.parseInt(arr[0]);
        int max = min;
        
        for(int i = 1; i < arr.length; i++){
            int temp = Integer.parseInt(arr[i]);
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}