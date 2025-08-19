import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;       // 행
        int m = maps[0].length;    // 열
        
        // 방향 배열 (상, 하, 좌, 우)
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0}); // 시작점
       
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            
            // 네 방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 범위 밖이면 패스
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                // 벽이거나 이미 방문한 곳이면 패스
                if (maps[nx][ny] != 1) continue;
                
                // 거리 갱신 = 현재 위치 + 1
                maps[nx][ny] = maps[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }
        
        // 도착점에 저장된 값이 최단거리
        return maps[n-1][m-1] == 1 ? -1 : maps[n-1][m-1];
    }
}