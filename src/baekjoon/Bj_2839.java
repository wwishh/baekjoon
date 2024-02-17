package baekjoon;

import java.util.Scanner;

public class Bj_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		cal(n);
	}

	public static void cal(int n) {
		int result = 0;

		while (true) {

			if (n >= 10 && n!=12) {
				n = n - 5;
				result++;
			} else {
				if (n % 3 == 0)
					result += n / 3;
				else if(n==5)
					result++;
				else if(n==8)
					result += 2;
				else
					result = -1;
				break;
			}
		}

		System.out.println(result);
	}

}
