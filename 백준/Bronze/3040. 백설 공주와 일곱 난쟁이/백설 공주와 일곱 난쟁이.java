import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n[] = new int[9];
		
		for(int i=0; i<n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		int tempSum = 0, overValue=0;
		int liar1=0, liar2=0;
		
		
		for(int i=0; i<n.length; i++) {
			tempSum += n[i];
		}
		
		overValue = tempSum - 100;
		
			
		for(int i=0; i<n.length-1; i++) {
			for(int j=i+1; j<n.length; j++) {
				if(n[i]+n[j]==overValue) {
					liar1 = n[i];
					liar2 = n[j];
				}
			}
		}
		
		

		for(int i=0; i<n.length; i++) {
			if(n[i]==liar1 || n[i]==liar2) {
				continue;
			}
			System.out.println(n[i]);
		}
		
	}

}
