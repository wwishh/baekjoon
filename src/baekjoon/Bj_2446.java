package baekjoon;

import java.util.Scanner;

public class Bj_2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=n; i>1; i--) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=2*i-1; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++)
				System.out.print(" ");
			for(int j=0; j<2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
