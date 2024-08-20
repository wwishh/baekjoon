import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		ArrayList<Integer> sequence = new ArrayList<>();
		for(int i=1; sequence.size()<1000;i++) {
			for(int j=0; j<i; j++) {
				sequence.add(i);
			}
		}
		
		int sum=0;
		for(int i=a-1; i<b; i++) {
			sum += sequence.get(i);
		}
		
		System.out.println(sum);
	}

}
