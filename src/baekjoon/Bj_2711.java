package baekjoon;

import java.util.Scanner;

public class Bj_2711 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			StringBuffer str = new StringBuffer(sc.next());
			
			StringBuffer result = str.deleteCharAt(n-1);
			System.out.println(result);
		}
	}

}
