import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();

		String str[] = new String[t];

		double result = 0;

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine().replaceAll(" ", "");
		}
		

		for (int i = 0; i < str.length; i++) {

			int check = str[i].indexOf(".");

			if (check != -1) {
				result = Double.parseDouble(str[i].substring(0, check + 2));
			} else {
				result = str[i].charAt(0) - '0';
			}
			

			for (int j = 1; j < str[i].length(); j++) {

				if (str[i].charAt(j) == '@') {
					result *= 3;
				}

				if (str[i].charAt(j) == '%') {
					result += 5;
				}

				if (str[i].charAt(j) == '#') {
					result -= 7;
				}
			}

			System.out.printf("%.2f", result);
			System.out.println();
		}
	}

}
