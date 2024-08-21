import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0; //"666"이 포함된 숫자를 세기 위한 변수
		int number = 666;
		
		while(true) {
			
			if(String.valueOf(number).contains("666")) {
				count++;
			}
			
			if(count == n) {
				System.out.println(number);
				break;
			}
			
			number++;
		}
	}

}
