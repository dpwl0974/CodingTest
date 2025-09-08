import java.util.*;
class Solution {
    // Map → 원소별 개수까지 관리 가능 (사실상 Set + 카운터) 
    // Set 두번 쓸 때보다 시간 복잡도 효율적
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> right = new HashMap<>();
        Set<Integer> left = new HashSet<>();
        
        // 모든 토핑이 오른쪽에 추가
        for (int t : topping) {
            // getOrDefault() + 1 -> 카운트 기능
            right.put(t, right.getOrDefault(t, 0) + 1);
        }
        
        // 왼쪽에 추가하며 오른쪽에서 원소 카운트 수 감소
        for (int t : topping) {
            left.add(t);
            
            right.put(t, right.get(t) - 1);
            if (right.get(t) == 0) {
                right.remove(t);
            }

            if (left.size() == right.size()) {
                answer++;
            }
        }
        
        return answer;
    }
//     public int solution(int[] topping) {
//         int answer = 0;
        
//         for(int i = 1; i <= topping.length; i++){
//             if(check(i, topping)) answer++;
//         }
        
//         return answer;
//     }
    
//     public boolean check(int num, int[] arr) {
//         // Set 특징 - 중복 제거 활용
//         // O(n^2)
//         Set<Integer> set = new HashSet<>();
//         Set<Integer> set2 = new HashSet<>();
        
//         for(int i = 0; i < arr.length; i++){
//             if(i <= num) set.add(arr[i]);
//             else set2.add(arr[i]);
//         }
        
//         return set.size() == set2.size() ? true : false;
//     }
}