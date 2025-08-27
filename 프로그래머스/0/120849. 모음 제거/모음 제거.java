class Solution {
    public String solution(String my_string) {
        
        String[] str = new String[]{"a","e","i","o","u"};
        
        for(String s : str) my_string = my_string.replace(s, "");
        
        return my_string;
    }
}