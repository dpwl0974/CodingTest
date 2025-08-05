import java.util.*;

/*
1. 우선 순위와 인덱스 큐에 저장

2. 우선 순위 기준으로 내림차순 정렬

3. 정렬된 리스트를 순회하면서:
   - 실제 큐에서 문서를 하나씩 꺼낸다
   - 그 문서가 정렬 리스트의 현재 값과 같으면 count++
   - 해당 문서의 인덱스가 location과 같으면 return count
 */


class Solution {
    public int solution(int[] priorities, int location) {
        int count = 0;

        //큐 (인덱스, 우선순위)
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }

        //우선순위 내림차순 정렬 리스트 생성
        List<Integer> sortedPriorities = new ArrayList<>();
        for (int p : priorities) {
            sortedPriorities.add(p);
        }
        sortedPriorities.sort(Collections.reverseOrder());  // 내림차순 정렬

        int priorityIndex = 0; // 현재 처리할 우선순위 인덱스

        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // [index, priority]

            if (current[1] == sortedPriorities.get(priorityIndex)) {
                count++;
                if (current[0] == location) {
                    return count;
                }
                priorityIndex++; // 다음 우선순위로
            } else {
                queue.offer(current); // 다시 뒤로 보냄
            }
        }

        return count; // 도달 불가능
    }
}
