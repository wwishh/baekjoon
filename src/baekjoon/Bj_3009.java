package baekjoon;

import java.util.Scanner;

public class Bj_3009 {
	
	
	private static int xy(int[] a) {
		
		int xy = 0;
		
		if (a[0] == a[1])
			xy = a[2];
		else if(a[0]==a[2])
			xy = a[1];
		else if(a[1]==a[2])
			xy = a[0];
		
		return xy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arrX = new int[3];
		int[] arrY = new int[3];

		for (int i = 0; i < 3; i++) {
			arrX[i] = sc.nextInt();
			arrY[i] = sc.nextInt();
		}

		int x = xy(arrX);
		int y = xy(arrY);
			

		System.out.println(x + " " + y);

	}

}
