class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0); // 0부터 시작
    }
    
    public int dfs(int[] numbers, int target, int idx, int sum) {
        // 순회 완료 -> sum과 target 비교
        if(idx == numbers.length) return sum == target ? 1 : 0; 
        
        // idx 더하거나 빼서 결과 확인
        return dfs(numbers, target, idx+1, sum + numbers[idx])
            + dfs(numbers, target, idx+1, sum - numbers[idx]);
    }
}