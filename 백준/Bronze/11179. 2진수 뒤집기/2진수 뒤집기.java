import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int reversedBinary = 0;

        while (n > 0) {
            reversedBinary = (reversedBinary << 1) | (n & 1);
            n >>= 1;
        }

        System.out.println(reversedBinary);
    }
	

}
