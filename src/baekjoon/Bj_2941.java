package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine() + "!";

		int cnt = 0;

		for (int i = 0; i < input.length()-1; i++) {
			if (input.charAt(i + 1) != '!') {
				if (input.charAt(i) == 'c' && (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-')) {
					cnt++;
					i++;
				} else if (input.charAt(i) == 'd' && input.charAt(i + 1) == '-') {
					cnt++;
					i++;
				} else if (input.charAt(i) == 'd' && input.charAt(i + 1) == 'z' && input.charAt(i + 2) == '=') {
					cnt++;
					i += 2;

				} else if ((input.charAt(i) == 'l' || input.charAt(i) == 'n') && input.charAt(i + 1) == 'j') {
					cnt++;
					i++;

				} else if ((input.charAt(i) == 's' || input.charAt(i) == 'z') && input.charAt(i + 1) == '=') {
					cnt++;
					i++;
				} else {
					cnt++;
				}
			}else {
				cnt++;
			}
		}

		bw.write(Integer.toString(cnt));
		bw.close();

	}

}
