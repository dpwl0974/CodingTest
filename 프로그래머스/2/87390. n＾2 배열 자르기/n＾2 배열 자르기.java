class Solution {
    public int[] solution(int n, long left, long right) {
        //크기 계산
        int size = (int)(right - left + 1);
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            long index = left + i;
            int row = (int)(index / n);
            int col = (int)(index % n);
            
            arr[i] = Math.max(row, col) + 1;
        }

        return arr;
    }
}


// import java.util.ArrayList;
// class Solution {
//     public int[] solution(int n, long left, long right) {
//         int[] arr = new int[(int)(right - (int)left + 1];
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int row = 1; row <= n; row++){
//             for(int col = 1; col <= n; col++){
//                 if(row <= col) list.add(col);
//                 else if(row > col) list.add(row);
//             }
//         }
        
//         int i = 0;
//         int j = (int)left;
        
//         while(isValid(j, (int)right)){   
//             arr[i] = list.get(j);
//             i++;
//             j++;
//         }
//         return arr;
//     }
//     public boolean isValid(int j, int right){
//         return j > right ? false : true;
//     }
// }