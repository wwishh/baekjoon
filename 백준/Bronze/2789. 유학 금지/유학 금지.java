import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String remove = "CAMBRIDGE";
		
		String str = sc.nextLine();
		
		for(int i=0; i<remove.length(); i++) {
			str = str.replace(remove.charAt(i)+"", "");
		}

		
		System.out.println(str);
	}

}
