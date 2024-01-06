package baekjoon;

import java.util.Scanner;

public class Bj_10101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x==60 && y==60 && z==60)
			System.out.println("Equilateral");
		else if(x+y+z==180 && (x==y || x==z || y==z))
			System.out.println("Isosceles");
		else if(x+y+z==180 && (x!=y&& y!=z))
			System.out.println("Scalene");
		else if(x+y+z!=180)
			System.out.println("Error");
	}

}
