import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 자동 오름차순 (Min Heap)
        for (int s : scoville) pq.add(s);
       
        while(pq.size() > 1 && pq.peek() < K){
            int first = pq.poll();
            int second = pq.poll();
            int newSco = first + (second * 2);
            
            pq.add(newSco);
            cnt++;
        }
    
        return pq.peek() < K ? -1 : cnt;
    }
}