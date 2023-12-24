package baekjoon;

import java.util.Scanner;

public class Bj_5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String number = sc.nextLine();
		
		int time = 0;
		
		for(int i=0; i<number.length();i++) {
			if(number.charAt(i)=='A'||number.charAt(i)=='B'||number.charAt(i)=='C')
				time+=3;
			else if(number.charAt(i)=='D'||number.charAt(i)=='E'||number.charAt(i)=='F')
				time+=4;
			else if(number.charAt(i)=='G'||number.charAt(i)=='H'||number.charAt(i)=='I')
				time+=5;
			else if(number.charAt(i)=='J'||number.charAt(i)=='K'||number.charAt(i)=='L')
				time+=6;
			else if(number.charAt(i)=='M'||number.charAt(i)=='N'||number.charAt(i)=='O')
				time+=7;
			else if(number.charAt(i)=='P'||number.charAt(i)=='Q'||number.charAt(i)=='R'||number.charAt(i)=='S')
				time+=8;
			else if(number.charAt(i)=='T'||number.charAt(i)=='U'||number.charAt(i)=='V')
				time+=9;
			else
				time+=10;
		}
		
		System.out.println(time);
	}

}
