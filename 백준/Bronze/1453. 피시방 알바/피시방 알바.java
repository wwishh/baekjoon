import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean check[] = new boolean[101]; 
		
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			int input = sc.nextInt();
			
			if(check[input]==false) {
				check[input]=true;
			}else {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
