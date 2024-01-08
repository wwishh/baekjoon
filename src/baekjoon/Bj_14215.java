package baekjoon;

import java.util.Scanner;

public class Bj_14215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int alength = sc.nextInt();
		int blength = sc.nextInt();
		int clength = sc.nextInt();
		
		
		if(alength + blength > clength && alength + clength > blength && blength + clength > alength)
			System.out.println(alength + blength + clength);
		else if(alength + blength <= clength)
			System.out.println(alength+blength + (alength+blength-1));
		else if(alength + clength <= blength)
			System.out.println(alength+clength + (alength+clength-1));
		else if(blength + clength <= alength)
			System.out.println(blength+clength + (blength+clength-1));
	}

}
