package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_1296 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		int[] cnt = new int[4];
		int[] teamCnt = new int[4];
		int[] totalCnt = new int[4];

		int probability = -1;
		String victory = "";

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'L')
				cnt[0]++;
			else if (name.charAt(i) == 'O')
				cnt[1]++;
			else if (name.charAt(i) == 'V')
				cnt[2]++;
			else if (name.charAt(i) == 'E')
				cnt[3]++;
		}

		int n = Integer.parseInt(sc.next());
		String[] team = new String[n];

		for (int i = 0; i < team.length; i++) {
			team[i] = sc.next();
		}

		Arrays.sort(team);

		for (int i = 0; i < team.length; i++) {
			
			Arrays.fill(teamCnt, 0);
			Arrays.fill(totalCnt, 0);

			for (int j = 0; j < team[i].length(); j++) {
				if (team[i].charAt(j) == 'L')
					teamCnt[0]++;
				else if (team[i].charAt(j) == 'O')
					teamCnt[1]++;
				else if (team[i].charAt(j) == 'V')
					teamCnt[2]++;
				else if (team[i].charAt(j) == 'E')
					teamCnt[3]++;
			}

			for (int j = 0; j < totalCnt.length; j++) {
				totalCnt[j] = cnt[j] + teamCnt[j];
			}

			int result = ((totalCnt[0] + totalCnt[1]) * (totalCnt[0] + totalCnt[2]) * (totalCnt[0] + totalCnt[3])
				* (totalCnt[1] + totalCnt[2]) * (totalCnt[1] + totalCnt[3]) * (totalCnt[2] + totalCnt[3])) % 100;

			if (result > probability) {
				probability = result;
				victory = team[i];
			}

		}

		System.out.println(victory);

	}

}
