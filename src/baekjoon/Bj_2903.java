package baekjoon;

import java.util.Scanner;

public class Bj_2903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 2;
		
		for(int i=0; i<n; i++) {
			cnt += (int)Math.pow(2,i);
		}
		
		int result = (int)Math.pow(cnt, 2);
		
		System.out.println(result);

	}

}
