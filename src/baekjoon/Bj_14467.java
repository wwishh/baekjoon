package baekjoon;

import java.util.Scanner;

public class Bj_14467 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] cow = new int[n];
		int[] position = new int[n];

		int cnt = 0;

		int check = 0;

		for (int i = 0; i < n; i++) {
			cow[i] = sc.nextInt();
			position[i] = sc.nextInt();
		}

		for (int i = 1; i <= 10; i++) {
			boolean first = false;
			for (int j = 0; j < n; j++) {
				if (i == cow[j]) {
					if (first == false) {
						first = true;
						check = position[j];
					}

					if (check != position[j]) {
						cnt++;
						check = position[j];
					}
				}
			}
		}
		
		System.out.println(cnt);
	}

}
