import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                // 먼저 n번째 문자 비교
                if (s1.charAt(n) != s2.charAt(n)) {
                    return Character.compare(s1.charAt(n), s2.charAt(n)); // 아스키코드 값 비교 (양수면 s1, 음수면 s2가 크다)
                }
                // n번째 문자가 같으면 사전순 비교
                return s1.compareTo(s2); // 문자열 전체 사전순
            }
        });

        return strings;
    }
}