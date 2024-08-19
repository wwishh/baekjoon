import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		String str = "";
		
		for(int i=0; i<a.length(); i++) {
			str += a.charAt(i);
			str += b.charAt(i);
		}
			
		while(true) {
			if(str.length()==2)
				break;
			
			String temp = "";
			
			
			
			for(int i=0; i<str.length()-1; i++) {
				
				int number = (str.charAt(i) -'0')  + (str.charAt(i+1) -'0');
				
				if(number>=10)
					temp += Integer.toString(number - 10);
				else
					temp += Integer.toString(number);
			}
			
			str = temp;
		}
		
		System.out.println(str);
		
		
	}

}
