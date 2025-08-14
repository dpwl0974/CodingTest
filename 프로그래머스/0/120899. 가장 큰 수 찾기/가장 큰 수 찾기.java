class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
    int maxIndex = 0; // 최대값 인덱스

    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
            maxIndex = i;
        }
    }

    return new int[] { max, maxIndex };
    }
}