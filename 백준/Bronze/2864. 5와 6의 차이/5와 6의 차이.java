import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		
		String a = sc.next();
		String b = sc.next();
		
		String maxA = a.replace('5', '6');
		String maxB = b.replace('5', '6');
		String minA = a.replace('6', '5');
		String minB = b.replace('6', '5');

		
		max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
		min = Integer.parseInt(minA) + Integer.parseInt(minB);
		
		System.out.print(min + " ");
		System.out.println(max);
		
	}

}
