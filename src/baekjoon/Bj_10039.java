package baekjoon;

import java.util.Scanner;

public class Bj_10039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for(int i=0; i<5; i++){
            int n = sc.nextInt();
            if(n<40)
               sum += 40;
            else
                sum += n;
        }

        int avg = 0;

        avg = sum/5;

        System.out.println(avg);


    }
}
