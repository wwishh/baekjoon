import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int []w = new int[10];
		int []k = new int[10];
		
		int []wTop = new int[3];
		int []kTop = new int[3];
		
		for(int i=0; i<w.length; i++)
			w[i] = sc.nextInt();
		
		for(int i=0; i<k.length; i++)
			k[i] = sc.nextInt();
		
		for(int i=0; i<w.length; i++) {
			if(w[i]>wTop[0]) {
				if(w[i]>wTop[1]) {
					if(w[i]>wTop[2]) {
						wTop[0] = wTop[1];
						wTop[1] = wTop[2];
						wTop[2] = w[i];
					}
						
					else {
						wTop[0] = wTop[1];
						wTop[1] = w[i];
					}
						
				}else
					wTop[0] = w[i];
				
			}
		}
		
		for(int i=0; i<k.length; i++) {
			if(k[i]>kTop[0]) {
				if(k[i]>kTop[1]) {
					if(k[i]>kTop[2]) {
						kTop[0] = kTop[1];
						kTop[1] = kTop[2];
						kTop[2] = k[i];
					}
					else {
						kTop[0] = kTop[1];
						kTop[1] = k[i];
					}
						
				}else
					kTop[0] = k[i];
				
			}
		}
		
		
		int wSum = 0;
		
		for(int i=0; i<wTop.length; i++)
			wSum += wTop[i];

		int kSum = 0;
		
		for(int i=0; i<kTop.length; i++)
			kSum += kTop[i];
		
		System.out.println(wSum + " " + kSum);
		
	}

}
