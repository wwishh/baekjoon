package baekjoon;

import java.util.Scanner;

public class Bj_9506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			
			if(n==-1)
				break;
			
			int sum = 0;
			String result = n + " = ";
			
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					sum+=i;
					result += i + " + ";
				}
			}
			
			if(sum==n) {
				result = result.substring(0, result.length()-3);
				System.out.println(result);
			}
			else if(sum!=n){
				result = n + " is NOT perfect.";
				System.out.println(result);
			}
			
		}
	}

}
