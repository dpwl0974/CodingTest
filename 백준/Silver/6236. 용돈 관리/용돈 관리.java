import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] ars) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //날짜
        int n = Integer.parseInt(st.nextToken());
        //인출 횟수
        int m = Integer.parseInt(st.nextToken());

        //투 포인터 적용
        int min = 1, max = 1;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            min = Math.max(min, arr[i]);
            max += arr[i];
        }

        //인출 횟수 카운트  //필요한 돈 (sum)
        int cnt, money, mid;

        while(min <= max) {
            mid  = (min + max) / 2;
            money = 0;
            cnt = 1;

            for (int i = 0; i < n; i++) {
                money += arr[i];
                if (money > mid) {
                    cnt++;
                    money = arr[i];
                }
            }

            if(cnt > m) min = mid + 1;
            else max = mid - 1;
        }
        System.out.println(min);
    }
}