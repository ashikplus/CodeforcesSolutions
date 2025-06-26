package ashik.codeforces;

import java.util.Scanner;

public class BasilsGarden {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            long[] h = new long[n];
            
            for(int i=0; i<n; i++) {
            	h[i] = input.nextLong();
            }
            
            long sec = 0;
            for(int i=n-1; i>=0; i--) {
            	
            	if(sec < h[i]) {
            		long s = h[i] - sec;
            		sec+=s;
            	}else {
            		sec+=1;
            	}
            }
            
            System.out.println(sec);
        }
        
        input.close();
	}

}
