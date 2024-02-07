package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1475 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		
		int cnt = 1;
		
		int[] number = new int[10];
		
		for(int i=0; i<n.length(); i++) {
			number[n.charAt(i)-'0']++;
		}
		
		for(int i=0; i<number.length; i++) {
			if(i==6||i==9) {
				if((number[6]+number[9])%2==0)
					cnt = Math.max(cnt, (number[6]+number[9])/2);
				else
					cnt = Math.max(cnt, (number[6]+number[9])/2+1);
			}else {
				cnt = Math.max(cnt, number[i]);
			}
		}
		
		System.out.println(cnt);
	}

}
