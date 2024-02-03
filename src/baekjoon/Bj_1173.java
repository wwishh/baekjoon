package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_1173 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //운동 시간
		int m = Integer.parseInt(st.nextToken()); //초기 맥박
		int M = Integer.parseInt(st.nextToken()); //최대 맥박
		int T = Integer.parseInt(st.nextToken()); //맥박 증가 크기
		int R = Integer.parseInt(st.nextToken()); //맥박 감소 크기

		int X = m;
		
		int time = 0;
		int cnt = 0;

		if (m + T > M)
			time = -1;
		else {
			while (N > cnt) {
				if(X+T<=M) {
					cnt++;
					time++;
					X += T;
				}
				else {
					time++;
					if(X-R>=m)
						X -= R;
					else
						X = m;
				}
			}
		}

		System.out.println(time);
	}

}
