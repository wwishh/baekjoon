package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//풀이 검색해서 푼 문제
public class Bj_1018 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int sol = Integer.MAX_VALUE;
		
		String[] chess = new String[n];
		
		for(int i=0; i<n;i++) {
			chess[i] = br.readLine();
		}
		
		for(int i=0; i<=n-8; i++){
			for(int j=0; j<=m-8; j++) {
				int solve = solved(i, j, chess);
				
				if(sol > solve)
					sol = solve;
			}
		}
		
		System.out.println(sol);
	}
	
	private static int solved(int n, int m, String[] chess) {
		String orgBoard[] = {"WBWBWBWB", "BWBWBWBW"};
		int whiteSol = 0;

		for(int i=0; i<8; i++) {
			int row = n + i;
			for(int j=0; j<8; j++) {
				int col = m + j;

				if(chess[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
					whiteSol++;
				}
			}
		}

		return Math.min(whiteSol, 64 - whiteSol);
	}

}
