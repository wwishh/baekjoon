import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] array = new int[m - n + 1];

			for (int j = 0; j < array.length; j++)
				array[j] = n + j;

			int digitToCount = 0;

			int count = countDigitInArray(array, digitToCount);
			
			System.out.println(count);

		}
	}

	public static int countDigitInArray(int[] array, int digit) {
		int count = 0;

		for (int num : array) {
			count += countDigitInNumber(num, digit);
		}

		return count;
	}

	public static int countDigitInNumber(int num, int digit) {
		int count = 0;

		// 숫자가 0일 경우를 따로 처리
		if (num == 0 && digit == 0) {
			return 1;
		}

		while (num > 0) {
			int currentDigit = num % 10;
			if (currentDigit == digit) {
				count++;
			}
			num /= 10;
		}

		return count;
	}

}
