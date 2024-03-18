import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] result = {'E','A', 'B', 'C', 'D'};

        for(int i=0; i<3; i++){
            int cnt = 0;
            for(int j=0; j<4; j++){
                int n = sc.nextInt();
                if(n==0)
                    cnt++;
            }
            System.out.println(result[cnt]);
        }
    }
}
