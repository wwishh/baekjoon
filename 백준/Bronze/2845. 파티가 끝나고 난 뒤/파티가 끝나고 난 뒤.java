import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int p = sc.nextInt();
		
		int[] cnt = new int[5];
		
		for(int i=0; i<cnt.length; i++) {
			cnt[i] = sc.nextInt();
		}
		
		for(int i=0; i<cnt.length; i++) {
			System.out.print(cnt[i] - l*p + " ");
		}
	}

}
