package baekjoon;

import java.util.Scanner;

public class Bj_14425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int m = Integer.parseInt(sc.next());

		String[] s = new String[n];

		for (int i = 0; i < n; i++)
			s[i] = sc.next();
		
		int cnt = 0;
		
		for (int i = 0; i < m; i++) {
			String str = sc.next();
			
			for(int j=0; j<s.length; j++) {
				if(s[j].equals(str))
					cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
