import java.util.*;

public class Main {    
 
    static int n, num; //건물 수와 건물 번호
    static ArrayList<Integer>[] list; 
    static int[] b; //각 건물 짓는 비용 정보
    static int[] indegree;
    static int[] bCost; //비용의 최댓값
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int t = scan.nextInt();
        for(int i = 0; i < t; i++) {
            n = scan.nextInt();
            int k = scan.nextInt();
            
            b = new int[n + 1];
            list = new ArrayList[n + 1];
            for(int j = 1; j <= n; j++) {
                b[j] = scan.nextInt();
                list[j] = new ArrayList<>();
            }
            
            indegree = new int[n + 1];
            for(int j = 0; j < k; j++) {
                int s = scan.nextInt();
                int e = scan.nextInt();
                list[s].add(e); //간선 추가
                indegree[e]++; //진입 차수 증가
            }
            num = scan.nextInt(); 
            
            bCost = new int[n + 1]; 
            topologySort();
            System.out.println(bCost[num]);
        }
    }
    
    public static void topologySort() {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i < indegree.length; i++) {
            if(indegree[i] == 0) { //진입 차수 0인 노드 큐에 삽입
                bCost[i] = b[i];
                q.offer(i);
            }
        }
        
        while(!q.isEmpty()) {
            int current = q.poll(); //큐 맨 앞의 값 반환 후 삭제
            
            for(int i = 0; i < list[current].size(); i++) { 
                int next = list[current].get(i);
                bCost[next] = Math.max(bCost[current] + b[next], bCost[next]); //최대비용 저장
                indegree[next]--; //진입 차수 감소
                if(indegree[next] == 0) q.offer(next); //진입 차수 0인 노드 큐에 삽입
            }
        }
    }
}
