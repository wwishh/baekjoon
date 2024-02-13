package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1543 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		String word = br.readLine();

		search(text, word);
		
	}

	public static void search(String text, String word) {

		int cnt = 0;

		while (true) {
			if (text.indexOf(word) != -1) { //특정 문자열이 존재하면 해당 문자열의 첫 번째 인덱스 반환, 그렇지 않으면 -1 반환
				cnt++;
				text = text.substring(text.indexOf(word)+word.length()); //단어 길이만큼 더해서 찾은 단어빼고 다시 찾도록 함
			}else
				break;
		}

		System.out.println(cnt);
	}

}
