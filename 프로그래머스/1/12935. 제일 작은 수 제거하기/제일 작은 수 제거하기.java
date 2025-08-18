import java.util.*;
// for문 사용이지만 예외처리 먼저 하여 좋은 코드
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1}; // 예외 처리

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }

        int[] result = new int[arr.length - 1];
        int idx = 0;
        for (int num : arr) {
            if (num != min) result[idx++] = num;
        }

        return result;
    }
}


/* 스트림 방식 
class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int[] result = Arrays.stream(arr)
                             .filter(x -> x != min)
                             .toArray();
        return result.length == 0 ? new int[]{-1} : result;
    }
} */


// class Solution {
//     public int[] solution(int[] arr) {
//         List<Integer> answer = new ArrayList<>();
//         int min = arr[0];
        
//         for(int i = 1; i < arr.length; i++) {
//             min = Math.min(min,arr[i]);
//         }
        
//         for(int i : arr) {
//             if(i != min) answer.add(i);
//         }
//         if(answer.isEmpty()) answer.add(-1);
        
//         return answer.stream().mapToInt(Integer::intValue).toArray();
//     }
// }
