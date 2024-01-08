package baekjoon;

import java.util.Scanner;

public class Bj_2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int []n = new int[5];
		int sum = 0;
		
		for(int i=0; i<n.length; i++) {
			n[i] = sc.nextInt();
			sum += Math.pow(n[i], 2); 
		}
		
		int output = sum % 10;
		
		System.out.println(output);
	
	}

}
