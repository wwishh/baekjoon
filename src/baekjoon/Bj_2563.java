package baekjoon;

import java.util.Scanner;

public class Bj_2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int [][] arr = new int[100][100];
		
		int area = 0;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int k=y;k<y+10;k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==1) {
					area++;
				}
					
			}
		}
		
		System.out.println(area);

	}

}
