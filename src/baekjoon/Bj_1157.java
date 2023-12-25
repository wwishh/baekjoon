package baekjoon;

import java.util.Scanner;

public class Bj_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		str = str.toUpperCase();

		char[] alpha = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z' };
		int[] cnt = new int[26];

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < alpha.length; j++) {
				if (str.charAt(i) == alpha[j]) {
					cnt[j]++;
				}
			}
		}

		int max = cnt[0];
		int index = 0;
		int multi = 0;

		for (int i = 1; i < cnt.length; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				index = i;
			}
		}

		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == max)
				multi++;
		}
		
		if(multi>=2)
			System.out.println("?");
		else
			System.out.println(alpha[index]);

	}

}
