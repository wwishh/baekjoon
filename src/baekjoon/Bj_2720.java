package baekjoon;

import java.util.Scanner;

public class Bj_2720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] c = new int[t];
		int [] unit = {25, 10, 5, 1};
		int [][] result = new int[t][4]; 
		
		
		for(int i=0; i<c.length;i++)
			c[i] = sc.nextInt();
		
		for(int i=0; i<result.length;i++) {
			for(int j=0; j<result[0].length; j++) {
				result[i][j] = c[i]/unit[j];
				c[i]=c[i]%unit[j];
			}
		}
		
		for(int i=0; i<result.length;i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
