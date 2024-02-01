package baekjoon;

import java.util.Scanner;

public class Bj_1991 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		String[] tree = new String[n];

		for (int i = 0; i < tree.length; i++)
			tree[i] = sc.nextLine();
	}

	public void preorder(char root, String[] tree) {

		String print = "";

		for (int i = 0; i < tree.length; i++) {

			if (tree[i].trim().charAt(0) == root) {
				print += tree[i].trim().charAt(0);
				if (tree[i].trim().charAt(1) != '.') {
					preorder(tree[i].trim().charAt(1), tree);
					return;
				} else {
					
				}
			}
		}
	}

}
