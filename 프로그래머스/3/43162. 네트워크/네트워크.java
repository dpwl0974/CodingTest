class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];  
        int cnt = 0; 
        
        for (int i = 0; i < n; i++) { 
            if (!visited[i]) {  
                dfs(computers, visited, i);  // DFS로 연결된 컴퓨터 모두 방문
                cnt++;
            }
        }
        
        return cnt;
    }
    
    private void dfs(int[][] computers, boolean[] visited, int node) {
        visited[node] = true; // 현재 노드 방문 처리
        
        for (int i = 0; i < computers.length; i++) {   // 모든 노드와 연결 여부 확인
            if (computers[node][i] == 1 && !visited[i]) {  // 연결되어 있고 아직 방문하지 않았다면
                dfs(computers, visited, i); // 재귀적으로 방문
            }
        }
    }
}
