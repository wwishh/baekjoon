package baekjoon;

import java.util.Scanner;

public class Bj_1357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		StringBuffer x = new StringBuffer(sc.next());
		StringBuffer y = new StringBuffer(sc.next());
		
		int resverseX = Integer.parseInt(x.reverse().toString());
		int resverseY = Integer.parseInt(y.reverse().toString());
		
		String sum = Integer.toString(resverseX + resverseY);
		
		StringBuffer result = new StringBuffer(sum);
		
		int reverseSum = Integer.parseInt(result.reverse().toString());
		
		System.out.println(reverseSum);
	}

}
