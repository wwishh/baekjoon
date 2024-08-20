import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		while(true) {
			String a = sc.nextLine();
			String b = sc.nextLine();
			
			if(a.equals("END")&&b.equals("END"))
				break;
			
			String result = "";
			
			// 문자열을 문자 배열로 변환
	        char[] charArrayA = a.toCharArray();
	        char[] charArrayB = b.toCharArray();

	        // 문자 배열 정렬
	        Arrays.sort(charArrayA);
	        Arrays.sort(charArrayB);

	        // 정렬된 문자 배열을 다시 문자열로 변환
	        String sortedStringA = new String(charArrayA);
	        String sortedStringB = new String(charArrayB);
	        
	        if(sortedStringA.equals(sortedStringB))
	        	result = "Case " + i + ": same";
	        else
	        	result = "Case " + i + ": different";
	        
	        System.out.println(result);
	        
	        i++;
		}
	}

}
