package baekjoon;

import java.util.Scanner;

public class Bj_11719 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] str = new String[100];

        int count = 0; // 입력된 라인 수를 저장할 변수

        // 입력이 더 이상 없거나 100개의 라인을 입력할 때까지 반복
        while (sc.hasNextLine() && count < 100) {
            str[count] = sc.nextLine();
            System.out.println(str[count]);
            count++;
        }
    }
}
