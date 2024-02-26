package baekjoon;

import java.util.Scanner;

public class Bj_13458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int b = sc.nextInt();
		int c = sc.nextInt();

		long cnt = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] -= b;
			cnt++;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && a[i] % c == 0) {
				cnt += a[i] / c;
			} else if (a[i] > 0 && a[i] % c != 0) {
				cnt += a[i] / c + 1;
			}
		}
		
		System.out.println(cnt);

	}

}
