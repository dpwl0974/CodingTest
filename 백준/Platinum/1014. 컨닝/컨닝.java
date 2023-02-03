import java.util.*;

public class Main {
	static int dp[][]; //자리
	static boolean visited[][]; //컨닝 가능한 자리
	static int N,M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int i = 0; i < T; i++) {
			N = sc.nextInt();
			M = sc.nextInt();
			dp = new int[1<<N][M];

			for(int j = 0; j < (1<<N); j++) {
				Arrays.fill(dp[j], -1); //-1로 배열 초화화
			}

			visited = new boolean[N][M];
			for(int j = 0; j < N; j++) {
				String input = sc.next();
				for(int k = 0; k < M; k++) {
					if(input.substring(k, k+1).equals("x"))
						visited[j][k] = true;
				}
			}
			int result = getDP(0,0);
			System.out.println(result);
		}
	}

	static int getDP(int n, int m) {
		if(m==M) return 0; //모든 줄을 체크한 경우
		if(dp[n][m] != -1) return dp[n][m];
		int num = n;
		
		for(int i = 0; i < N; i++) {
			if ((n & (1<<i)) > 0){
				num |= (1<<(i+1));
				num |= (1<<(i -1));
			}
		}

		int res = getDP(0, m+1); //아무도 앉히지 않고 다음 줄로 넘어가는 경우
		for(int i = 1; i < (1<<N); i++) {
			if((i&num) > 0) continue; //나올 수 없는 경우의 수 제외
			int count = 0;
			boolean isAvail = true;

			for(int j = 0; j < N && isAvail; j++) {
				if((i & (1<<j)) > 0) { //해당 자리에 학생이 앉아있는 경우
					count++;
					if (visited[j][m]) isAvail = false; //장애물이 있을 시 = 나올 수 없는 경우의 수
				}
			}
			if(!isAvail) continue; //
			res = Math.max(res, getDP(i, m+1) + count);
		}
		return dp[n][m] = res;
	}
}
