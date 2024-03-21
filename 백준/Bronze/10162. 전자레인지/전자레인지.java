import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] cnt = new int[3];

            if(n/300>0){
                cnt[0] = n/300;
                n = n%300;          
            }
            
            if(n/60>0){
                cnt[1] = n/60;
                n = n%60;
            }
            
            if(n/10>0){
                cnt[2] = n/10;
                n = n%10;  
            }
            
            if(n>0&&n<10){
                System.out.println(-1);
                return;
            }

            System.out.println(cnt[0] + " " + cnt[1] + " " + cnt[2]);

            

    }
}
