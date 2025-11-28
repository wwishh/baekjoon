import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); //테스트케이스 개수
		
		for(int i=0; i<t; i++) {
			BigInteger sum = new BigInteger("0");
			
			int student = sc.nextInt(); //학생 수
			
			for(int j=0; j<student; j++) {
				BigInteger cnt = sc.nextBigInteger();	
				sum = sum.add(cnt);
			}
			
			if(sum.mod(BigInteger.valueOf(student)).equals(BigInteger.ZERO)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}


	}

}
