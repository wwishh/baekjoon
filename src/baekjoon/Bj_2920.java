package baekjoon;

import java.util.Scanner;

public class Bj_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String check = "1 2 3 4 5 6 7 8";
		
		StringBuffer sb = new StringBuffer(check);
		String reverse = sb.reverse().toString();
		
		if(input.equals(check))
			System.out.println("ascending");
		else if(input.equals(reverse))
			System.out.println("descending");
		else
			System.out.println("mixed");
	}

}
