import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int j=0;j<T;j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int res = 1;
			
			for (int i=0;i<b;i++) {
                res = (res * a) % 10;
            }
			if(res==0) res=10;
			System.out.println(res);
		}
	}
}