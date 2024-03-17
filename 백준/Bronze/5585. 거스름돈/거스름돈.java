import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cnt = 0;

		int money = 1000 - n;

		while (true) {
			if (money == 0)
				break;
			else if (money >= 500) {
				cnt += money / 500;
				money = money % 500;
			} else if (money >= 100) {
				cnt += money / 100;
				money = money % 100;
			} else if (money >= 50) {
				cnt += money / 50;
				money = money % 50;
			}

			else if (money >= 10) {
				cnt += money / 10;
				money = money % 10;
			} else if (money >= 5) {
				cnt += money / 5;
				money = money % 5;
			}

			else if (money >= 1) {
				cnt += money;
				money = 0;
			}
		}

		System.out.println(cnt);
	}
}
