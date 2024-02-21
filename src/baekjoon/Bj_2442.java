package baekjoon;

import java.util.Scanner;

public class Bj_2442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=n-1; j>=i; j--)
				System.out.print(" ");
			
			for(int j=1; j<=2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
