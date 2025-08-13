import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length / 2;
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])) set.add(nums[i]);
        }
    
        return set.size() > n ? n : set.size();
    }
}