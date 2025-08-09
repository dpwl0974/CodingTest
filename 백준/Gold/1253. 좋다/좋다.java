import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);

        //입력 수
        int n=sc.nextInt();

        //입력 받은 값
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();

        //정렬 통해 left, rigth 사용
        Arrays.sort(arr);

        //좋다 수
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int left = 0; //min
            int right = n-1; //max

            //left, rigth 값 조정하며 확인하기
            while(true){
                if(i == left) left++;
                else if(i == right) right--;

                if(left >= right) break; //좋은 수가 없음

                if(arr[left] + arr[right] > arr[i] ) right--;
                else if(arr[left] + arr[right] < arr[i]) left++;
                else { //좋은 수 
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
