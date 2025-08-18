// 또 다른 풀이
class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                cnt++;
                if (prices[j] < prices[i]) break; // 떨어지면 멈춤
            }
            answer[i] = cnt;
        }
        return answer;
    }
}

// import java.util.*;
// class Solution {
//     public int[] solution(int[] prices) {
//         List<Integer> answer = new ArrayList<>();
//         Stack<Integer> stack = new Stack<>();
        
//         for(int i = prices.length - 1; i >= 0; i--) {stack.push(prices[i]);}
        
//         while (!stack.isEmpty()) {
//             int check = stack.get(stack.size() - 1);
//             int cnt = 0;

//                 for (int i = stack.size() - 2; i >= 0; i--) { // 한 칸씩 내려가며 비교
//                     cnt++;
//                 if (stack.get(i) < check) break;
//                 }

//             answer.add(cnt);
//             stack.pop(); 
//         }
//         return answer.stream().mapToInt(Integer::intValue).toArray();
//     }
// }
