import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int callCnt = sc.nextInt(); // 통화의 개수

		int priceY = 0;

		int priceM = 0;

		for (int i = 0; i < callCnt; i++) {
			int callTime = sc.nextInt();

			priceY += (callTime / 30 + 1) * 10;

			priceM += (callTime / 60 + 1) * 15;

		}

		if (priceY > priceM) {
			System.out.println("M " + priceM);
		} else if (priceY == priceM) {
			System.out.println("Y M " + priceY);
		} else {
			System.out.println("Y " + priceY);
		}
	}

}
