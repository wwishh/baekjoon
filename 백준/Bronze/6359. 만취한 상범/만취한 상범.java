import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n = 0;
		int [] d;
		
		for(int tc=1; tc<=t; tc++) {
			n = sc.nextInt();
			d = new int[n+1];
			for(int i=1; i<=n; i++) {
				for(int j=1; i*j<=n; j++) {
					if(d[i*j]!=0)
						d[i*j]=0;
					else
						d[i*j]=1;
				}
			}
			int ans=0;
			for(int i=1; i<=n; i++) {
				ans+=d[i];
			}
			System.out.println(ans);
		}
		
		
	}

}
