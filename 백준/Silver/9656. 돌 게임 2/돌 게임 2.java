import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int stone = sc.nextInt();
		
		if(stone%2==0)
			System.out.println("SK");
		else if(stone%2==1)
			System.out.println("CY");
		
	}

}
