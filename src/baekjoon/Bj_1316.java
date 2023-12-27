package baekjoon;

import java.util.Scanner;

public class Bj_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int total = 0;
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			String str = sc.next()+"!";
			
			for(int j=0; j<str.length()-1; j++) {
				if(str.charAt(j+1)!='!') {
					if(str.charAt(j)!=str.charAt(j+1)) {
						for(int k=j+1;k<str.length()-1;k++) {
							if(str.charAt(j)==str.charAt(k)) {
								cnt++;
							}
						}
					}
				}
				
			}
			
			if(cnt==0||str.length()==2) {
				total++;
			}
			
			cnt=0;

		}
		
		System.out.println(total);
		
	}

}
