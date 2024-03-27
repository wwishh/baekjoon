import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        int cnt = 0;

        for(int i=0; i<5; i++){
            int num = sc.nextInt();
            if(day==num)
                cnt++;
        }

        System.out.println(cnt);
    }
}
