import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] count = new int[10001]; // 10000까지의 수를 세기 위한 배열
		
		// 입력 받은 숫자의 개수를 카운트
		for(int i=0; i<n; i++) {
			int number = Integer.parseInt(br.readLine());
			count[number]++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<count.length; i++) {
			while(count[i]>0) {
				sb.append(i).append('\n');
				count[i]--;
			}
		}
		
		System.out.print(sb);
		
	}	

}
