package baekjoon;

import java.util.Scanner;

public class Bj_10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			String [][] hotel = new String[h][w];
			
			for(int j=hotel.length-1; j>=0; j--) {
				for(int k=0; k<hotel[0].length;k++) {
					if(k+1>=10)
						hotel[j][k] = (j+1) + "" + (k+1);
					else
						hotel[j][k] = (j+1) + "0" + (k+1);
				}
					
			}
			
			int cnt = 0;
			
			for(int k=0; k<hotel[0].length; k++) {
				for(int j=0; j<hotel.length; j++) {
					cnt++;
					if(cnt==n)
						System.out.println(hotel[j][k]);
				}
			}
		}

	}

}
