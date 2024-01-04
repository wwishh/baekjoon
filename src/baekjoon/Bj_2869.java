package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2869 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int v = Integer.parseInt(str.split(" ")[2]);

//		int snail  = 0;
//		int day = 1;
//
//		while(true) {
//			snail += a;
//			if(snail==v)
//				break;
//			snail -= b;
//			day++;
//		}
		
		int space = v - a; //내려오기 전 남은 공간 
		int end = a - b; //총 전진 길이
		
		int day = space / end + 1;
		
		if(space % end!=0)
			day++;
		
		System.out.println(day);

	}

}
