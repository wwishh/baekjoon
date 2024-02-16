package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_10867 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		arr = Arrays.stream(arr).distinct().toArray();
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
