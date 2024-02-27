package baekjoon;

import java.util.Scanner;

public class Bj_10870{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = fibonacci(n);

        System.out.println(result);
    }

    public static int fibonacci(int n){
        if(n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        else    
            return fibonacci(n-1) + fibonacci(n-2);
        
    }
}