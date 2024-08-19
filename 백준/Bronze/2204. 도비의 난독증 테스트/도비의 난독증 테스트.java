import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int input = sc.nextInt();
			
			if(input==0)
				break;
			
			String words[] = new String[input];
			
			for(int i=0; i<input; i++) {
				words[i] = sc.next(); 
			}
			
			Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
			
			System.out.println(words[0]);
			
		}
	}

}
