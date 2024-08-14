import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 새의 수

		int cnt = 1;

		int result = 0;

		while (true) {
			
			if (n == 0)
				break;

			if (n >= cnt) {
				n -= cnt;
				result++;
				cnt++;
			} else {
				cnt = 1;
			}
	
		}
		
		System.out.println(result);
	}

}
