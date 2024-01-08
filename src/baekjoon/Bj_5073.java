package baekjoon;

import java.util.Scanner;

public class Bj_5073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {

			int[] leg = new int[3];
			
			for(int i=0; i<leg.length; i++)
				leg[i] = sc.nextInt();
			
			if (leg[0] == 0 && leg[1] == 0 && leg[2] == 0)
				break;
			
			int max = Math.max(leg[0], Math.max(leg[1], leg[2]));
			
			int sum = 0;
			int cnt = 0;
			
			for(int i=0; i<leg.length; i++) {
				if(leg[i]==max&&cnt==0) {
					cnt++;
					continue;
				}
				sum+=leg[i];
					
			}
			
			if(sum>max) {
				if(leg[0]==leg[1] && leg[1]==leg[2])
					System.out.println("Equilateral");
				else if((leg[0]==leg[1] && leg[0]!=leg[2])||(leg[0]==leg[2] && leg[0]!=leg[1])||(leg[1]==leg[2] && leg[0]!=leg[1]))
					System.out.println("Isosceles");
				else if(leg[0]!=leg[1]&& leg[1]!=leg[2])
					System.out.println("Scalene");
			}
			
			else
				System.out.println("Invalid");
		
		}

	}

}
