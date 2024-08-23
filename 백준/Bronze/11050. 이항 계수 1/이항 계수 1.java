import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int result = 0;
		
		if(factorial(n-k)*factorial(k)!=0)
				result = factorial(n)/(factorial(n-k)*factorial(k));

		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		return n * factorial(n-1);
	}

}
