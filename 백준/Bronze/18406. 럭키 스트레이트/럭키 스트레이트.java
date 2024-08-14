import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String n = sc.nextLine();
		
		int []arr1 = new int[n.length()/2];
		int []arr2 = new int[n.length()/2];
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<n.length()/2; i++) {
			arr1[i] = n.charAt(i) - '0';
		}
		
		for(int i=0; i<n.length()/2; i++) {
			arr2[i] = n.charAt(i+n.length()/2) - '0';
		}
		
		for(int i=0; i<arr1.length; i++)
			sum1 += arr1[i]; 
		
		for(int i=0; i<arr2.length; i++)
			sum2 += arr2[i];
		
		if(sum1==sum2)
			System.out.println("LUCKY");
		else if(sum1!=sum2)
			System.out.println("READY");
	}

}
