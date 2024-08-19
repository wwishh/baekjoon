import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		int happy = 0;
		int sad = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.length() >= 3) {
				if (str.charAt(i) == ':') {
					if (str.substring(i, i + 3).equals(":-)"))
						happy++;
					else if (str.substring(i, i + 3).equals(":-("))
						sad++;

				}
			}
		}

		String status = "";

		if (happy == 0 && sad == 0)
			status = "none";
		else if (happy == sad)
			status = "unsure";
		else if (happy > sad)
			status = "happy";
		else if (sad > happy)
			status = "sad";

		System.out.println(status);
	}

}
