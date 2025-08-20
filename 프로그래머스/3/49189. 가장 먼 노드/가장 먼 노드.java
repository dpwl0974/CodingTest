import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        // 인덱스 -> 노드 번호
        // 해당 인덱스의 값 -> 그 노드에 연결된 다른 노드들의 리스트
        for(int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        
        // 양방향 그래프
        for(int[] node : edge) {
            graph.get(node[0]).add(node[1]);
            graph.get(node[1]).add(node[0]);
        }
        
        int[] distances = new int[n+1];
        Arrays.fill(distances, -1); // 초기화 -> 방문 ❌
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); //1번 노드 시작
        distances[1] = 0;
        
        // BFS
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            
            for(int near : graph.get(cur)){
                if(distances[near] == -1) { 
                    distances[near] = distances[cur] +1; // 방문 ⭕️
                    queue.add(near);
                }
            }
        }
        
        int max = 0; // 최장거리
        for(int dist : distances) max = Math.max(max, dist); 
        
        int cnt = 0;
        for(int dist : distances) {
            if(dist == max) cnt++;
        }
        
        return cnt;
    }
}