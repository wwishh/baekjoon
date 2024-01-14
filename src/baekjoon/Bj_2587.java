package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_2587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		int sum = 0;
		int avg = 0;
		int mid = num[2];
		
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		
		avg = sum/5;
		
		System.out.println(avg);
		System.out.println(mid);
	}

}
