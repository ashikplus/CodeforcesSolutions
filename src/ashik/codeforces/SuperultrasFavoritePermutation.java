package ashik.codeforces;

import java.util.Scanner;

public class SuperultrasFavoritePermutation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            if(n == 2 || n == 3 || n==4) {
            	System.out.println(-1);
            	continue;
            }
            
            int m = 0;
            int track = 0;
            boolean found = false;
            boolean prime = false;
            
            for(int i=1; i<=n; i+=2) {
            	System.out.print(i+" ");
            	m=i;
            }
            
            for(int i=2; i<=n; i+=2) {
            	
            	if(found == false) {
            		prime = isPrime(m+i);
            	}
            	if(found == false && prime) {
            		track++;
            		continue;
            	}else {
            		found = true;
            		System.out.print(i+" ");
            	}
            }
            
            for(int i=2,j=0; j<track; i+=2, j++) {
            	System.out.print(i+" ");
            }
            
        }
        input.close();
	}
	
	public static boolean isPrime(int n) {
	    if (n <= 1) return false;
	    if (n == 2) return true;
	    if (n % 2 == 0) return false;

	    int sqrt = (int)Math.sqrt(n);
	    for (int i = 3; i <= sqrt; i += 2) {
	        if (n % i == 0) return false;
	    }
	    return true;
	}


}
