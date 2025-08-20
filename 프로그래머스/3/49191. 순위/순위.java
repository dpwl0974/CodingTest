class Solution {
    public int solution(int n, int[][] results) {
        boolean[][] graph = new boolean[n + 1][n + 1];
        
        // 승패 관계
        for (int[] result : results) {
            int winner = result[0];
            int loser = result[1];
            graph[winner][loser] = true;
        }
        
        // 플로이드-와샬 알고리즘으로 간접적인 승패 관계 추론
        // k: 거쳐가는 노드
        for (int k = 1; k <= n; k++) {
            // i: 출발 노드 (이기는 선수)
            for (int i = 1; i <= n; i++) {
                // j: 도착 노드 (지는 선수)
                for (int j = 1; j <= n; j++) {
                    // i가 k를 이기고, k가 j를 이긴다면 -> i는 j를 이긴다.
                    if (graph[i][k] && graph[k][j]) {
                        graph[i][j] = true;
                    }
                }
            }
        }
        
        int answer = 0;
        // 순위가 확정된 선수 찾기
        for (int i = 1; i <= n; i++) {
            int count = 0; // i 선수와 승패 관계가 결정된 선수들의 수
            for (int j = 1; j <= n; j++) {
                // i가 j를 이기거나, j가 i를 이기는 관계가 성립하면 카운트 증가
                if (graph[i][j] || graph[j][i]) {
                    count++;
                }
            }
            
            // i 자신을 제외한 모든 선수(n-1)와 승패 관계가 결정되었다면 순위 확정
            if (count == n - 1) {
                answer++;
            }
        }
        
        return answer;
    }
}