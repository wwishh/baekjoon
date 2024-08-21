import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Member {
    int age;
    String name;
    int joinOrder;

    Member(int age, String name, int joinOrder) {
        this.age = age;
        this.name = name;
        this.joinOrder = joinOrder;
    }
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		List<Member> members = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			int age = Integer.parseInt(input[0]);
			String name = input[1];
			members.add(new Member(age, name, i));
		}

		// 정렬
		members.sort(new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				if (m1.age != m2.age) {
					return Integer.compare(m1.age, m2.age);
				} else {
					return Integer.compare(m1.joinOrder, m2.joinOrder);
				}
			}
		});

		// 출력
		StringBuilder sb = new StringBuilder();
		for (Member member : members) {
			sb.append(member.age).append(" ").append(member.name).append("\n");
		}
		System.out.print(sb);
	}

}
