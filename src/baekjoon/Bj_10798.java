package baekjoon;

import java.util.Scanner;

public class Bj_10798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[5];
		String word = "";
		int maxleng = 0;
		
		
		for(int i=0; i<str.length; i++) {
			str[i] = sc.next();
			if(maxleng<str[i].length())
				maxleng = str[i].length();
		}
		
		for(int i=0; i<maxleng; i++) {
			for(int j=0; j<str.length;j++) {
				if(str[j].length()>i) {
					word += str[j].charAt(i);
				}
			}
		}
		
		System.out.println(word);

	}

}
