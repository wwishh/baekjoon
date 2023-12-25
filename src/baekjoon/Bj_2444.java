package baekjoon;

import java.util.Scanner;

public class Bj_2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int b = n-i-1; b > 0; b--)
				System.out.print(" ");
			for (int j = 1; j <= i * 2 + 1; j++)
				System.out.print("*");

			System.out.println();
		}

		for (int i = n - 1; i > 0; i--) {
			for (int b = n-i; b > 0; b--)
				System.out.print(" ");
			for (int j = 1; j <= i * 2 - 1; j++)
				System.out.print("*");

			System.out.println();
		}
	}

}
