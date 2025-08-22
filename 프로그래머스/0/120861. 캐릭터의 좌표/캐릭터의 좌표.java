import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;
        
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        
        int xLimit = board[0] / 2; // 가로 최대 이동 가능 범위
        int yLimit = board[1] / 2; // 세로 최대 이동 가능 범위
        
        HashMap<String, Integer> dirMap = new HashMap<>();
        dirMap.put("up", 0);  // 위
        dirMap.put("down", 1);  // 아래
        dirMap.put("left", 2);  // 왼쪽
        dirMap.put("right", 3);  // 오른쪽

        for (String str : keyinput) {
            int dir = dirMap.get(str);  // 명령어 → 인덱스
            int nx = x + dx[dir];  // x 좌표 이동
            int ny = y + dy[dir];  // y 좌표 이동    
            
            if (Math.abs(nx) <= xLimit && Math.abs(ny) <= yLimit) {
                x = nx; // 유효하면 이동 확정
                y = ny;
            }
        }
        
        
        return new int[] {x, y};
    }
}