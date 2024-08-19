import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			String list = sc.nextLine();

			if (list.equals("-1"))
				break;

			String[] strArr = list.split(" ");

			int arr[] = new int[strArr.length-1];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(strArr[i]);
			}
			
			int cnt = 0;
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length; j++) {
					if(arr[i]*2==arr[j])
						cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}

}
