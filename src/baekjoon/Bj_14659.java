package baekjoon;

import java.util.Scanner;

public class Bj_14659 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		int max = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length-1; i++) {
			
			int cnt = 0;
			
			if(arr[i]>=arr[i+1]) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]>=arr[j])
						cnt++;
					else
						break;
				}
			}
			
			i+=cnt;
			
			max = Math.max(max, cnt);
		}
		
		System.out.println(max);
	}

}
