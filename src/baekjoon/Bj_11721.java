package baekjoon;

import java.util.Scanner;

public class Bj_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			if((i+1)%10==0)
				System.out.println();
		}
		
	}

}
