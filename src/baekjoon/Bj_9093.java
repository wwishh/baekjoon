package baekjoon;

import java.util.Scanner;

public class Bj_9093 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());

        String[] str = new String[t];

        for(int i = 0; i<t; i++)
            str[i] = sc.nextLine();
        
        for(int i=0; i<str.length; i++){
            String[] reverse = str[i].split(" ");
            for(int j=0; j<reverse.length; j++){
                StringBuffer sb = new StringBuffer(reverse[j]);
                System.out.print(sb.reverse().toString() + " ");
            }
            System.out.println();
        }
            
    }
}
