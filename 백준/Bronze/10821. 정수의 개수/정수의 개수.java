import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String []strArr = str.split(",");
		
		System.out.println(strArr.length);
	}

}
