import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cute = 0;
		int ncute = 0;
		
		for(int i=0; i<n; i++) {
			int vote = sc.nextInt();
			
			if(vote==1)
				cute++;
			else
				ncute++;
		}
		
		if(cute>ncute)
			System.out.println("Junhee is cute!");
		else
			System.out.println("Junhee is not cute!");
	}

}
