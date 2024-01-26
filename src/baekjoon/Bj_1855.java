package baekjoon;

import java.util.Scanner;

public class Bj_1855 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int k = Integer.parseInt(sc.nextLine());

		String str = sc.nextLine();

		char[][] code = new char[str.length() / k][k];

		int cnt = 0;

		for (int i = 0; i < code.length; i++) {

			for (int j = 0; j < code[0].length; j++) {
				code[i][j] = str.charAt(cnt);
				cnt++;
			}
			
			i++;
			
			if(i==code.length)
				break;
			
			for (int j = code[0].length - 1; j >= 0; j--) {
				code[i][j] = str.charAt(cnt);	
				cnt++;
			}
		}

		for (int i = 0; i < code[0].length; i++) {
			for (int j = 0; j < code.length; j++) {
				System.out.print(code[j][i]);
			}
		}

	}

}
