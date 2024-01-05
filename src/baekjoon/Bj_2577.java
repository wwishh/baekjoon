package baekjoon;

import java.util.Scanner;

public class Bj_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int[] cnt = new int[10];

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String multi = String.valueOf(a * b * c);

		for (int i = 0; i < multi.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (multi.charAt(i) == arr[j])
					cnt[j]++;
			}
		}

		for (int i = 0; i < cnt.length; i++)
			System.out.println(cnt[i]);
	}

}
