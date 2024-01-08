package baekjoon;

import java.util.Scanner;

public class Bj_11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while(n>1) {

			int x = 0;

			for(int i=2; i<=n;i++) {
				if(n%i==0) {
					x = i;
					break;
				}
			}
			
			System.out.println(x);
			n = n/x;
		}

	}

}

