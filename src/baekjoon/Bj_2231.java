package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());  //미지수 n
		
		for(int i=1; i<=n; i++) {
			int sum = i;
			int m = i; //n의 생성자
			
			while(true) {
				sum+=m%10;
				m=m/10;
				if(m<10) {
					sum+=m;
					break;
				}
					
			}
			
			if(sum==n) {
				System.out.println(i);
				return;
			}
	
		}
		System.out.println(0);
		
	}

}
