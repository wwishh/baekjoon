package baekjoon;

import java.util.Scanner;

public class Bj_25206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		double total = 0;
		double credit = 0;
		for(int i=0; i<20; i++) {
			String str = sc.nextLine();
			
			if(!str.split(" ")[2].equals("P")) {
				if(str.split(" ")[2].equals("A+"))
					total += Double.parseDouble(str.split(" ")[1]) * 4.5;
				else if(str.split(" ")[2].equals("A0"))
					total += Double.parseDouble(str.split(" ")[1]) * 4.0;
				else if(str.split(" ")[2].equals("B+"))
					total += Double.parseDouble(str.split(" ")[1]) * 3.5;
				else if(str.split(" ")[2].equals("B0"))
					total += Double.parseDouble(str.split(" ")[1]) * 3.0;
				else if(str.split(" ")[2].equals("C+"))
					total += Double.parseDouble(str.split(" ")[1]) * 2.5;
				else if(str.split(" ")[2].equals("C0"))
					total += Double.parseDouble(str.split(" ")[1]) * 2.0;
				else if(str.split(" ")[2].equals("D+"))
					total += Double.parseDouble(str.split(" ")[1]) * 1.5;
				else if(str.split(" ")[2].equals("D0"))
					total += Double.parseDouble(str.split(" ")[1]) * 1.0;
				else if(str.split(" ")[2].equals("F"))
					total += Double.parseDouble(str.split(" ")[1]) * 0.0;
				credit +=  Double.parseDouble(str.split(" ")[1]);
			}
			
			

		}
		
		
		double result = total/(credit);
		
		System.out.println(result);
	}

}
