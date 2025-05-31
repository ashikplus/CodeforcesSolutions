package ashik.codeforces;

import java.util.Scanner;

public class AssemblyViaRemainders {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int[] x = new int[n-1];
            int[] a = new int[n];
            
            for(int i=0; i<n-1; i++) {
            	x[i] = input.nextInt();
            }
            
            if(n==2) {
            	a[0] = x[0] + 1;
            	a[1] = x[0];
            	System.out.println(a[0]+" "+a[1]);
            	continue;
            }
            
            if(x[0] <= x[1]) {
            	a[0] = x[1] + 1;
            	a[1] = a[0] + x[0];
            }else {
            	a[0] = x[0] + 1;
            	a[1] = x[0];
            }
            
            for(int i=2; i<n-1; i++) {
            	
            	if(a[i-1] > x[i-1] && x[i-1] > x[i]) {
            		
            		a[i] = x[i-1];
            	}else {
            		
            		int rem = a[i-1] + x[i-1];
            		while(rem <= x[i]) {
            			rem += a[i-1];
            		}
            		a[i] = rem;
            	}
            }
            a[n-1] = x[n-2];
            
            for(int i=0; i<n; i++) {
            	System.out.print(a[i]+" ");
            }
            System.err.println();
        }
        input.close();
	}

}
