import java.util.*;

public class Main {    
 
    static int n, num;
    static ArrayList<Integer>[] list; 
    static int[] b;
    static int[] indegree;
    static int[] bCost; 
    
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
                list[s].add(e); 
                indegree[e]++;
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
            if(indegree[i] == 0) {
                bCost[i] = b[i];
                q.offer(i);
            }
        }
        
        while(!q.isEmpty()) {
            int current = q.poll();
            
            for(int i = 0; i < list[current].size(); i++) {
                int next = list[current].get(i);
                bCost[next] = Math.max(bCost[current] + b[next], bCost[next]);
                indegree[next]--;
                if(indegree[next] == 0) q.offer(next);
            }
        }
    }
}
