import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int[] arr = new int[5];
			for (int j = 0; j < 5; j++) {
				arr[j] = sc.nextInt();
			}

			Arrays.sort(arr);

			int sum = arr[1] + arr[2] + arr[3]; // 최고점과 최저점을 제외한 나머지 3개의 합
			int max2 = arr[3]; // 나머지 3개 중 최고점
			int min2 = arr[1]; // 나머지 3개 중 최저점

			if (max2 - min2 >= 4) {
				System.out.println("KIN");
			} else {
				System.out.println(sum);
			}
		}

	}

}
