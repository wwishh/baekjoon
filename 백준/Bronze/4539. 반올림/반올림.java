import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();

			int result = x;

			int length = (int) (Math.log10(x) + 1);

			for (int j = 1; j < length; j++) {
				int divisor = (int) Math.pow(10, j);
				result = (int) Math.round(result / (double) divisor) * divisor;
			}

			System.out.println(result);
		}
	}

}
