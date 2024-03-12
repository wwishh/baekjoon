package baekjoon;

import java.util.Scanner;

public class Bj_5543 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        int result = Math.min(Math.min(b1, b2), b3) + Math.min(d1, d2) - 50;
        
        System.out.println(result);
    }

}
