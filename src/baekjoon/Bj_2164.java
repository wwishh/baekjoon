package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bj_2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Queue<Integer> queue = new LinkedList<Integer>();

		//queue에 카드 순서대로 추가
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		
		while(queue.size()>1) {
			queue.remove();
			queue.add(queue.peek());
			queue.remove();
		}
		
		System.out.println(queue.peek());
		
	}

}
