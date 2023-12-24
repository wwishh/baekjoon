package baekjoon;

import java.util.Scanner;

public class Bj_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int [] alphaCnt = new int[26];
		
		for(int i=0; i<alphaCnt.length;i++) {
			alphaCnt[i] = -1;
		}
		
		String [] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s"
				,"t", "u", "v", "w", "x", "y", "z"};
		
		for(int i =0; i< alpha.length;i++ ) {
			alphaCnt[i] =  str.indexOf(alpha[i]);
		}
		
		for(int i=0; i<alphaCnt.length;i++) {
			System.out.print(alphaCnt[i] + " ");
		}

		
	}

}
