package baekjoon;

import java.util.Scanner;

public class Bj_1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String n = sc.nextLine();
			int leng = 2;
			
			if(n.equals("0"))
				break;
			
			for(int i=0; i<n.length(); i++) {
				if(n.charAt(i)=='1')
					leng+=2;
				else if(n.charAt(i)=='0')
					leng+=4;
				else
					leng+=3;
			}
			
			leng += n.length()-1;
			
			System.out.println(leng);
			
		}
	}

}
