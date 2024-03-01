package baekjoon;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bj_1764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int cnt = 0;
		
		// 중복값을 저장할 HashSet 생성
        Set<String> set = new TreeSet<>();
        // 중복된 값을 담을 HashSet 생성
        Set<String> duplicates = new TreeSet<>();

        for (int i=0; i<n+m; i++) {
        	
        	String str = sc.nextLine();
            // add() 메서드는 중복된 값을 추가하지 않고, 중복되지 않은 값만 추가함
            if (!set.add(str)) {
                // 이미 존재하는 경우 duplicates에 추가
            	cnt++;
                duplicates.add(str);
            }
        }
		
		System.out.println(cnt);

		for(String element : duplicates)
			System.out.println(element);

	}

}
