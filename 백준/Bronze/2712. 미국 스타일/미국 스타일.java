import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); //테스트 케이스 수
		
		for(int i=0; i<t; i++) {
			double value = sc.nextDouble();

			String str = sc.next();
			
			if(str.equals("kg")) {
				System.out.printf("%.4f %s\n", value*2.2046, "lb");
			}else if(str.equals("l")) {
				System.out.printf("%.4f %s\n", value*0.2642, "g");
			}else if(str.equals("lb")) {
				System.out.printf("%.4f %s\n", value*0.4536, "kg");
			}else if(str.equals("g")) {
				System.out.printf("%.4f %s\n", value*3.7854, "l");
			}
		}


	}

}
