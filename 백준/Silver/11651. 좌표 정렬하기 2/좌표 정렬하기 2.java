import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] xy = new int[n][2];

		for (int i = 0; i < xy.length; i++) {
			for (int j = 0; j < xy[0].length; j++) {
				xy[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(xy, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0] - o2[0]; 
				}else {
					return o1[1] - o2[1];
				}
			}
		});
		
		
		for(int i=0; i<n; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}

}
