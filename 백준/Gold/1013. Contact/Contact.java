import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String Vega = "(100+1+|01)+"; //정규표현식 사용
		int T = sc.nextInt();

		for(int i = 0; i < T; i++) {
			String N = sc.next();

			if(N.matches(Vega)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
