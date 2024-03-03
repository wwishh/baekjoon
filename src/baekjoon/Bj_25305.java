package baekjoon;

import java.util.*;

public class Bj_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Integer[] arr = new Integer[n]; // Integer 객체 배열로 선언

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[k-1]);
    }
}
