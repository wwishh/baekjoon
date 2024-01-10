package baekjoon;

import java.util.Scanner;

public class Bj_24267 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long sum = 0;
		
		for(long i=n-2; i>0; i--)
			sum += (i+1)*i/2;
		
		System.out.println(sum);
		System.out.println(3);
	}

}
