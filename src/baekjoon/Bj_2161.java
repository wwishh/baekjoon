package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bj_2161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//queue에 카드 순서대로 추가
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		//맨 앞 카드를 반환하며 제거, 남은 카드에서 제일 앞에 있는 걸 다시 추가하고 기존 카드 제거
		while(true) {
			if(queue.size()>0) {
				System.out.print(queue.poll() + " ");
				queue.add(queue.peek());
				queue.remove();
			}
			else
				break;
		}
	}

}
