import java.util.*;

class Solution {
    public int[] solution(String s) {

        s = s.substring(2, s.length() - 2);
        String sets[] = s.split("\\},\\{");
        
        Arrays.sort(sets, Comparator.comparingInt(String::length));
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (String set : sets) {
            String[] nums = set.split(",");
            for (String num : nums) {
                int val = Integer.parseInt(num);
                if (!seen.contains(val)) {
                    seen.add(val);
                    result.add(val);
                }
            }
        }      
        return result.stream().mapToInt(i -> i).toArray();
    }
}