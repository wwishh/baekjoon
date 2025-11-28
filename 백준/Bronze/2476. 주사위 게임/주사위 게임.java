import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 참여 인원 수

		int result = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {

			int value;

			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			if (x == y && y == z) {
				value = 10000 + x * 1000;
			} else if (x == y && y != z) {
				value = 1000 + 100 * x;
			} else if (x != y && y == z) {
				value = 1000 + 100 * y;
			} else if (x != y && x == z) {
				value = 1000 + 100 * x;
			} else {
				value = Math.max(Math.max(x, y), z) * 100;
			}

			if (result < value) {
				result = value;
			}

		}
        
        System.out.println(result);

	}

}
