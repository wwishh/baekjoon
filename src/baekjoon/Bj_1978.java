package baekjoon;

import java.util.Scanner;

public class Bj_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int total = 0;
		
		for(int i=0; i<n; i++) {
			int m  = sc.nextInt();
			
			int cnt = 0;
			
			for(int j=2; j<=m;j++) {
				if(m%j==0)
					cnt++;
			}
			if(cnt==1)
				total++;
		}
		
		System.out.println(total);
	}

}
