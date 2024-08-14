import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int n = sc.nextInt(); //학생 수
		
		int score[] = new int[n];
		
		for(int i=0; i<score.length; i++)
			score[i] = sc.nextInt();
		
		for(int i=0; i<score.length; i++) {
			if(score[i]>max)
				max = score[i];
			
			if(score[i]<min)
				min = score[i];
		}
		
		int result = max - min;
		
		System.out.println(result);
		
	}

}
