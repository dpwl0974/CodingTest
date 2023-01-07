import java.util.*;

public class Main {
    static double answer;
    static int n, t;
    static int[] ax = new int[21]; //x좌표 배열
    static int[] ay = new int[21]; //y좌표 배열
    static boolean[] c = new boolean[21]; //조합 여부

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            answer = Double.MAX_VALUE;
            for (int j = 0; j < n; j++){
                ax[j] = sc.nextInt();
                ay[j] = sc.nextInt();
            }
            go(0, 0);
            System.out.printf("%.6f\n", answer); 
        }
    }

    static void go(int cnt, int index) {
        if (cnt == n / 2) {
            double x = 0, y = 0;
            for (int i = 0; i < n; i++) {
                if (c[i]) {          //n/2개는 뺄셈
                    x -= ax[i];
                    y -= ay[i];
                }
                else {              //n/2개는 덧셈
                    x += ax[i];
                    y += ay[i];
                }
            }
            answer = Math.min(answer, Math.sqrt(x*x + y*y)); //최솟값 결정
            return;
        }
        if (index == n) return;
 
        go(cnt, index + 1);
        c[index] = true;
        go(cnt + 1, index + 1);
        c[index] = false;
    }
    
}
