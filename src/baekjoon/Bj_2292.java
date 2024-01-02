package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Bj_2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		
		int m = 6 *cnt + 1; 

		
		while (n>1) {
			
			if (n <= m) {
				cnt++;
				break;
			}
			
			cnt++;
			m += 6 *cnt;
		}

		bw.write(Integer.toString(cnt));
		bw.close();
	}

}
