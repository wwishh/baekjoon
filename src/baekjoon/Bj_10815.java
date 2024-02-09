package baekjoon;


//직접 풀어본 코드 (시간초과)
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Bj_10815 {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		int[] arr = new int[n];
//		
//		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
//		
//		for(int i=0; i<n; i++)
//			arr[i] = Integer.parseInt(st1.nextToken());
//		
//		int m = Integer.parseInt(br.readLine());
//		
//		int[] check = new int[m];
//		
//		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
//		
//		for(int i=0; i<m; i++)
//			check[i] = Integer.parseInt(st2.nextToken());
//		
//		int[] result = new int[m];
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<check.length; j++) {
//				if(arr[i]==check[j])
//					result[j] = 1;
//			}
//		}
//		
//		for(int i =0; i<result.length; i++)
//			System.out.print(result[i] + " ");
//	}
//
//}

//hashmap 사용
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj_10815 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n, m;
        HashMap<String, Integer> owned = new HashMap<>();

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            owned.put(st.nextToken(), 0);
        }

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            if (owned.get(st.nextToken()) != null) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString());
    }
}
