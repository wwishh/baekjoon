package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		
		int[] find = new int[m];
		
		for(int i=0; i<m; i++)
			find[i] = sc.nextInt();
		
		for(int i=0; i<find.length; i++) {
			int result = binarySearch(arr, find[i]);
			
			System.out.println(result);
		}
	}

	
	public static int binarySearch(int[] arr, int search) {
		int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == search) {
                return 1; // 값을 찾으면 1을 반환
            }

            if (arr[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0; // 값을 찾지 못하면 0을 반환
    }

}
