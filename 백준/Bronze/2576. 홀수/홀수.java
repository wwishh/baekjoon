import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int min = 100;
        int sum = 0;

        for(int i=0; i<7; i++){
            int n = sc.nextInt();
            if(n%2==1){
                sum += n;
                min = Math.min(min, n);
            }
        }

        if(sum==0)
            System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
