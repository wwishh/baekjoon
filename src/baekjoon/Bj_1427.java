package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Bj_1427 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		
		String[] digits = n.split("");
		
		Arrays.sort(digits, Collections.reverseOrder());
		
		String result = String.join("", digits);
		
		System.out.println(result);
	}

}
