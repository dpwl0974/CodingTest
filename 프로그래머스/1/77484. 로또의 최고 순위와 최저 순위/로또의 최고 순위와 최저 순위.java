import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winSet = new HashSet<>();
        
        for (int w : win_nums) {
            winSet.add(w);
        }

        int zeroCnt = 0; // 0의 개수
        int matchCnt = 0; // 일치 개수

        for (int n : lottos) {
            if (n == 0) {
                zeroCnt++;
            } else if (winSet.contains(n)) {
                matchCnt++;
            }
        }

        int max = getRank(matchCnt + zeroCnt);
        int min = getRank(matchCnt);

        return new int[]{max, min};
    }

    private int getRank(int cnt) {
        switch (cnt) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}