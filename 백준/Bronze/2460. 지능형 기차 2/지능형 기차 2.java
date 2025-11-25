import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int max = Integer.MIN_VALUE;

		int p = 0;

		for (int i = 0; i < 10; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			p -= x;
			p += y;
			
			if(p>max)
				max = p;
		}
		
		System.out.println(max);
	}

}
