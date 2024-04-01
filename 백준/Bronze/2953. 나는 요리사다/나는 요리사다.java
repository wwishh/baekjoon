import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        int number = 0;

        for (int i = 1; i <= 5; i++) {
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            int s4 = sc.nextInt();

            int sum = s1 + s2 + s3 + s4;

            if(result<sum){
                result = sum;
                number = i;
            }
        }

        System.out.print(number + " ");
        System.out.println(result);
    }
}
