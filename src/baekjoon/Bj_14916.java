package baekjoon;

import java.util.Scanner;

public class Bj_14916 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		cal(n);
	}

	public static void cal(int n) {
		int result = 0;

		while (true) {

			if (n >= 10) {
				n = n - 5;
				result++;
			}

			else if (n < 10 && n >= 5) {
				if ((n - 5) % 2 == 0) {
					n = n - 5;
					result++;
				} else {
					result += n / 2;
					break;
				}

			} else {
				if (n % 2 == 0)
					result += n / 2;
				else
					result = -1;
				break;
			}
		}

		System.out.println(result);
	}

}
