package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bj_2822 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//점수와 문제 번호를 저장할 HashMap 생성
		HashMap<Integer, Integer> score = new HashMap<Integer, Integer>();

		for (int i = 1; i <= 8; i++) {
			score.put(Integer.parseInt(br.readLine()), i);
		}

		//정렬하기 위해 ArrayList에 저장
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(score.entrySet());
		
		//key를 기준으로 내림차순 정렬
		list.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));

		// 리스트 데이터를 5개만 남기기
		list.subList(5, list.size()).clear();

		// value를 기준으로 오름차순 정렬
		list.sort(Comparator.comparing(Map.Entry::getValue));

		int sum = 0;

		for (Map.Entry<Integer, Integer> entry : list)
			sum += entry.getKey();

		System.out.println(sum);
		
		for (Map.Entry<Integer, Integer> entry : list)
			System.out.print(entry.getValue() + " ");
	}
}
