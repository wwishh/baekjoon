package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//아직 못푼 문제
public class Bj_1018 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int cnt = 0;
		
		String[] chess = new String[n];
		
		for(int i=0; i<n;i++) {
			chess[i] = br.readLine();
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m-1; j++) {
				if(chess[i].charAt(j)==chess[i].charAt(j+1)) {
					j++;
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
