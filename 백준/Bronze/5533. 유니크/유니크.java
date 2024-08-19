import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int score[] = new int[n];

		int card[][] = new int[n][3];
		
		
		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < card[0].length; j++) {
				card[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < card[0].length; i++) {
			for (int j = 0; j < card.length; j++) {
				 boolean isUnique = true;
			        for (int k = 0; k < n; k++) {
			            if (j != k && card[j][i] == card[k][i]) {
			                isUnique = false;
			                break;
			            }
			        }
			        if (isUnique) {
			            score[j] += card[j][i];
			        }
			}
		}
		
		for(int i=0; i<score.length; i++)
			System.out.println(score[i]);
		
		
	}

}
