import java.util.*;

public class Main {
	static int n;
    static int[] A, B, P;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        input();
        solve();
        System.out.println(sb.toString());
    }

    private static void solve() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[j] == B[i] && P[j] == -1) {
                    P[j] = i;
                    break;
                }
            }
        }

        for (int i : P) {
            sb.append(i + " ");
        }
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n];
        B = new int[n];
        P = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            B[i] = A[i];
        }

        Arrays.fill(P, -1);
        Arrays.sort(B);
    }
}