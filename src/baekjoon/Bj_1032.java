package baekjoon;

import java.util.Scanner;

public class Bj_1032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}

		String result = str[0];

		if (n > 1) {

			for (int i = 1; i < str.length; i++) {
				for (int j = 0; j < str[i].length(); j++) {
					if (str[i].charAt(j) != result.charAt(j))
						result = result.substring(0, j) + '?' + result.substring(j + 1);
				}
			}
		}
		
		System.out.println(result);
	}

}
