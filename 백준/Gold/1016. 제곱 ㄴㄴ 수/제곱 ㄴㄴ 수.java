import java.util.*;

public class Main {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long min = sc.nextLong();
		long max = sc.nextLong();

		boolean[] check = new boolean[1000001];
		long end = (long)Math.sqrt(max);

        //에라토스테네스의 체 원리
		for(long i = 2; i < end+1; i++) {
			long temp = i*i;
			long start = 0;
			if(min % temp == 0) {
				start = min / temp;
			}else {
				start = (min / temp) + 1;
			}
			for(long j = start; j*temp < max+1; j++) {
				check[(int)((j*temp)-min)] = true;
			}
		}

		for(int i = 0; i < (max-min+1); i++) {
			if(check[i]==false) {
				count++;
			}
		}
		System.out.println(count);
	}
}