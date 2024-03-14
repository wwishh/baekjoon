package baekjoon;

import java.util.Scanner;

public class Bj_10953 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] strs = new String[n];

        for(int i=0; i<n; i++){
            strs[i] = sc.nextLine();
        }

        for(int i =0; i<n; i++){
            int a = Integer.parseInt(strs[i].split(",")[0]);
            int b = Integer.parseInt(strs[i].split(",")[1]);

            System.out.println(a+b);
        }
	}

}
