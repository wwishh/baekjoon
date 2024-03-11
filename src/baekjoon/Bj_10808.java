package baekjoon;

import java.util.Scanner;

public class Bj_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int[] cnt = new int[26];

        for(int i=0; i<str.length(); i++){
            for(int j=0; j<alpha.length; j++){
                if(str.charAt(i)==alpha[j]){
                    cnt[j]++;
                    break;
                }

            }
        }

        for(int i=0; i<cnt.length; i++)
            System.out.print(cnt[i] + " ");
    }
}
