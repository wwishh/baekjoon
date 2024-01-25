package baekjoon;

import java.util.Scanner;

public class Bj_1292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int cnt = 1;
		
		int sum = 0;
		
		int num = 1;
		
		while(true) {
			for(int j=0; j<num; j++) {
				if(cnt>=a&&cnt<=b) {
					sum += num;
				}
				cnt++;	
				
			}
			num++;
			
			if(cnt>b)
				break;
			
		}
		
		System.out.println(sum);
	}

}
