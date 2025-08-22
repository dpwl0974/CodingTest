import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;
        
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        
        // 범위 잡기
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        
        Map<String, Integer> dirmap = new HashMap<>();
        dirmap.put("down", 0);
        dirmap.put("up", 1);
        dirmap.put("left", 2);
        dirmap.put("right", 3);
        
        for(String str : keyinput) {
            int dir = dirmap.get(str);
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            // 범위 체크 -> 절댓값
            if(Math.abs(nx) <= xLimit && Math.abs(ny) <= yLimit){
                x = nx;
                y = ny;
            }
        }
        return new int[] {x, y};
    }
}