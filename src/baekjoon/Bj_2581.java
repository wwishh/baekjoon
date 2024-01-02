package baekjoon;

import java.util.Scanner;

public class Bj_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int sum = 0;
		int min = 0;
		
		for(int i=m; i<=n; i++) {
			int cnt = 0;
			for(int j=2; j<=i;j++) {
				if(i%j==0)
					cnt++;
			}
			
			if(cnt==1) {
				sum += i;
				if(min==0)
					min = i;
			}
		}
		
		if(sum!=0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else if(sum==0)
			System.out.println(-1);
	}

}
