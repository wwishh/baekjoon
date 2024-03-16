import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			for(int j=0; j<n*2-i*2; j++)
				System.out.print(" ");
			for(int j=0; j<i; j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		for(int i=n-1; i>0; i--) {
			for(int j=i; j>0; j--)
				System.out.print("*");
			for(int j=n*2-i*2; j>0; j--)
				System.out.print(" ");
			for(int j=i; j>0; j--)
				System.out.print("*");
			
			System.out.println();
		}
	}

}
