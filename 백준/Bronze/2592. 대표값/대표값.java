import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int resultAvg = calAvg(arr);
		int resultMaxCount = calFrequency(arr);
		
		System.out.println(resultAvg);
		System.out.println(resultMaxCount);

	}

	public static int calAvg(int[] arr) {
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		avg = sum / arr.length;

		return avg;
	}

	public static int calFrequency(int[] arr) {
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
		}

		int mode = 0;
		int maxfrequency = 0;
		
		for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			int key = entry.getKey();
			int frequency = entry.getValue();
			
			if(frequency > maxfrequency) {
				maxfrequency = frequency;
				mode = key;
			}
		}

		return mode;
	}

}
