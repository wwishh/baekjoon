package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		String[] words = new String[n];
		
		for(int i=0; i<words.length; i++) {
			words[i] = br.readLine();
		}
		
		words = Arrays.stream(words).distinct().toArray(String[]::new);
		
		Arrays.sort(words);
		
		for(int i=1; i<words.length; i++) { //배열크기보다 1작게
			for(int j=0; j<words.length-1; j++) { //각 반복 별 비교횟수는 배열 크기에서 현재 반복라운드를 뺀 만큼 비교
				if(words[j].length()>words[j+1].length()) {
					String temp = words[j];
					words[j] = words[j+1];
					words[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		
	}

}
