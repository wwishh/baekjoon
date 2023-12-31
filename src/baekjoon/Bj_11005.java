package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_11005 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine(); 
		int n = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);

		String result = "";

		while(n>=b) {
			if(n%b>=10)
				result += (char)(n%b+55);		
			else 
				result += n%b;				
			n = n/b;
		}
		
		if(n>=10)
			result += (char)(n+55);
		else
			result += n;


		StringBuffer sb = new StringBuffer(result);
		result = sb.reverse().toString();

		bw.write(result);
		bw.close();
	}

}
