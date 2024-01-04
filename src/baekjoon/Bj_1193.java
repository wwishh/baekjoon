package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int count = 1; // 현재 위치까지의 대각선 개수
		int sum = 0; //현재 위치 전까지의 칸 개수
		
		while(true) {
			
			if(x<=sum + count) {
				if(count%2 == 1) {
					System.out.println(count - (x-sum-1) + "/" + (x-sum));
					break;
				}
				else {
					System.out.println((x-sum) + "/" + (count - (x-sum-1)));
					break;
				}
			}else {
				sum += count;
				count++;
			}
		
		}

	}

}

