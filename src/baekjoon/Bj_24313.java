package baekjoon;

import java.util.Scanner;

public class Bj_24313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n0 = sc.nextInt();
		
		int fn = a1*n0 + a0;
		int gn = n0;
		
		//a1*n0 + a0 <= c*n0 식을 좀 정리해보면 a0 <= (c-a1)n이 되는데
		//c-a1이 마이너스가 되면 부등호가 바뀌기 때문에
		//c>=a1 조건을 추가

		if(fn<=gn*c && a1<=c) 
			System.out.println(1);
		else
			System.out.println(0);
	}

}
