import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //높이
		int m = sc.nextInt(); //가로
		
		int [][]arr = new int[n][m];
		
		int x1=0, x2 = 0, y1=0, y2=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		boolean check = false;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j]==1&&check==false) {
					x1 = i+1;
					y1 = j+1;
					check=true;
				}else if(arr[i][j]==1&&check) {
					x2 = i+1;
					y2 = j+1;
				}
			}
		}
		
		int distance = Math.abs(x2-x1) + Math.abs(y2-y1);
		
		System.out.println(distance);
		
	}

}
