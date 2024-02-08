package baekjoon;

import java.util.Scanner;

public class Bj_7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] xy = new int[n][2];
		
		int rank = 1;
		
		String result = "";
		
		for(int i=0; i<xy.length; i++) {
			for(int j=0; j<xy[0].length; j++) {
				xy[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(xy[i][0]<xy[j][0]&&xy[i][1]<xy[j][1])
					rank++;
			}
			result += rank + " ";
			rank = 1;
		}
		
		//result = result.substring(0, result.length() - 1);
		
		System.out.println(result);
		
	}

}
