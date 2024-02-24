package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] times = new int[n];

		for (int i = 0; i < n; i++)
			times[i] = sc.nextInt();

		Arrays.sort(times);

		int sum = 0;
		int result = 0;

		for (int i = 0; i < times.length; i++) {

			sum += times[i];
			result += sum;
		}

		System.out.println(result);
	}

}
