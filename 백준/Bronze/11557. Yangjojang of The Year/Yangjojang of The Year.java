import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			String result = "";
			int check = 0;

			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				String name = sc.next();
				int score = sc.nextInt();

				if (score > check) {
					result = name;
					check = score;
				}
			}

			System.out.println(result);
		}
	}

}
