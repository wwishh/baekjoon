import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 1대 주차 요금
		int b = sc.nextInt(); // 2대 주차 요금
		int c = sc.nextInt(); // 3대 주차 요금

		int[] car = new int[100];

		int result = 0;

		for (int i = 0; i < 3; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			for (int j = start; j < end; j++) {
				car[j] += 1;
			}
		}
		

		for (int i = 0; i < 100; i++) {
			if (car[i] == 1)
				result += a;
			else if (car[i] == 2)
				result += b*2;
			else if (car[i] == 3)
				result += c*3;

		}
		
		System.out.println(result);

	}

}
