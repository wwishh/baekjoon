package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class Bj_7785 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//사원이름과 현재 출근상태 여부 저장하기 위한 해쉬맵
		HashMap<String, String> commute = new HashMap<String, String>();
		
		//사원이름이 맵에 있으면 상태를 변경하고 없으면 새로 저장
		for(int i=0; i<n; i++) {
			
			String str = br.readLine();
			
			String name = str.split(" ")[0];
			String status = str.split(" ")[1];
			
			if(commute.containsKey(name))
				commute.replace(name, status);
			else
				commute.put(name, status);
		}
		
		//ArrayList의 정렬 기능 사용하여 사전 순의 역순으로 출력
		List<String> list = new ArrayList<String>(commute.keySet());
		list.sort(Comparator.reverseOrder());
		
		for(String key : list) {
			if(commute.get(key).equals("enter"))
				System.out.println(key);
		}
		
		
	}

}
