import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		String[] strA = new String[n];
		String[] strB = new String[n];

		for (int i = 0; i < n; i++) {
			strA[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			strB[i] = sc.next();
		}

		String result = "Eyfa";

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < strA[i].length(); j++) {
				if (strA[i].charAt(j) != strB[i].charAt(j+j) || strA[i].charAt(j) != strB[i].charAt(j+j + 1)) {
					result = "Not Eyfa";
				}

			}
		}

		System.out.println(result);
	}

}
