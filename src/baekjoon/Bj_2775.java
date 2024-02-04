package baekjoon;

import java.util.Scanner;

public class Bj_2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			int result = apart(k,n);
			
			System.out.println(result);
		}
	}
	
	public static int apart(int k, int n) {
		
		int[] arr = new int[n];
		
		for(int i=1; i<=n; i++) {
			arr[i-1] = i;
		}
		
		for(int i=0; i<k; i++) {
			for(int j=1; j<n; j++) {
				arr[j] = arr[j] + arr[j-1];
			}
		}
		
		int people = arr[arr.length-1];
		
		return people;
	}

}
