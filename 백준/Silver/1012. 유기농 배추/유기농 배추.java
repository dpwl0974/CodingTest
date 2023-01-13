import java.util.*;

public class Main {
	static int M;
	static int N;
	static int K;

	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};

	static int[][] arr;
	static boolean[][] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		
			M = sc.nextInt();	
			N = sc.nextInt();	
			K = sc.nextInt();

			arr = new int[M][N];
			visit = new boolean[M][N];

			for(int j = 0; j < K; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				arr[x][y] = 1;
			}

			int count = 0;

			for(int j = 0; j<M; j++) {
				for(int z = 0; z<N; z++) {
					if(arr[j][z] == 1 && !visit[j][z]) {
						dfs(j,z);
						count++;
					}
				}
			}
			System.out.println(count);
		}		
	}


public static void dfs(int r, int c) {
	visit[r][c] = true;

	for(int i = 0; i < 4; i++){
		int nr = r + dr[i];
		int nc = c + dc[i];

		if(nr >= 0 && nc >= 0 && nr < M && nc < N) {
			if(arr[nr][nc] == 1 && !visit[nr][nc]) {
				dfs(nr, nc);
			}
		}
	}
} 
}