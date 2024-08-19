import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		int a[] = new int[10];

		for (int i = 0; i < t; i++) {
			for (int j = 0; j < a.length; j++)
				a[j] = sc.nextInt();

			Arrays.sort(a);

			System.out.println(a[7]);
		}

	}

}
