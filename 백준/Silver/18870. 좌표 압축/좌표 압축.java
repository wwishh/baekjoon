import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] original = new int[N];
        int[] sorted = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(st.nextToken());
            sorted[i] = original[i];
        }
        
        // 정렬
        Arrays.sort(sorted);
        
        // 좌표 압축을 위한 맵 생성
        Map<Integer, Integer> compressionMap = new HashMap<>();
        int rank = 0;
        for (int num : sorted) {
            if (!compressionMap.containsKey(num)) {
                compressionMap.put(num, rank++);
            }
        }
        
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int num : original) {
            sb.append(compressionMap.get(num)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
