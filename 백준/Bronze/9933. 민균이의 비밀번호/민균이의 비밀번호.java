import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		int n = sc.nextInt();
		
		String[] words = new String[n];
		
		for(int i=0; i<words.length; i++) 
			words[i] = sc.next();
		
		for(int i=0; i<words.length; i++) {
			for(int j=i; j<words.length; j++) {
				StringBuffer str = new StringBuffer(words[j]);
				
				if(words[i].equals(str.reverse().toString())) {
					System.out.println(words[i].length() + " " + words[i].charAt(words[i].length()/2));
					return;
				}
			}
	
		}
	}

}
