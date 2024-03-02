package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj_11004 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st1.nextToken());
		
		int k = Integer.parseInt(st1.nextToken());
		
		long[] arr = new long[n];
		
		for(int i=0; i<n; i++)
			arr[i]  = Long.parseLong(st2.nextToken());
		
		Arrays.sort(arr);
		
		System.out.println(arr[k-1]);
	}

}
