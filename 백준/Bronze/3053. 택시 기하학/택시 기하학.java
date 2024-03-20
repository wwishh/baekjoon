import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        double result1 = Math.PI * Math.pow(r, 2);
        double result2 = 2 * Math.pow(r, 2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
