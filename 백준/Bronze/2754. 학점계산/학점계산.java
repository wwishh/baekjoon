import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String grade = sc.nextLine();
		
		String result = "";
		
		
		if(grade.equals("A+")) {
			result = "4.3";
		}else if(grade.equals("A0")) {
			result = "4.0";
		}else if(grade.equals("A-")) {
			result = "3.7";
		}else if(grade.equals("B+")) {
			result = "3.3";
		}else if(grade.equals("B0")) {
			result = "3.0";
		}else if(grade.equals("B-")) {
			result = "2.7";
		}else if(grade.equals("C+")) {
			result = "2.3";
		}else if(grade.equals("C0")) {
			result = "2.0";
		}else if(grade.equals("C-")) {
			result = "1.7";
		}else if(grade.equals("D+")) {
			result = "1.3";
		}else if(grade.equals("D0")) {
			result = "1.0";
		}else if(grade.equals("D-")) {
			result = "0.7";
		}else if(grade.equals("F")) {
			result = "0.0";
		}
		
		System.out.println(result);
		
	}

}
