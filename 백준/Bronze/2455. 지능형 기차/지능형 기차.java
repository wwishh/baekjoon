import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tmp = 0;
		int max = 0;
		
		for(int i=0; i<4; i++) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				
				tmp -= n;
				tmp += m;
				
				if(tmp>max)
					max = tmp;
		}
		
		System.out.println(max);
	}

}
