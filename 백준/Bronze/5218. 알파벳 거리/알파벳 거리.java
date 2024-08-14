import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String strA = sc.next();
			String strB = sc.next();

			System.out.print("Distances: ");

			for (int j = 0; j < strA.length(); j++) {
				int distance = strB.charAt(j) - strA.charAt(j);

				if (distance < 0)
					System.out.print(distance + 26 + " ");
				else
					System.out.print(distance + " ");
			}
			System.out.println();
		}
	}

}
