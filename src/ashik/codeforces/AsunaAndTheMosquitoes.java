package ashik.codeforces;

import java.util.Scanner;

public class AsunaAndTheMosquitoes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            long sum = 0;
            int odd = 0;
            int even = 0;
            int max = Integer.MIN_VALUE;
            
            for(int i=0; i<n; i++) {
            	
            	if((a[i] & 1) == 0) {
            		even++;
            	}else {
            		odd++;
            	}
            	
            	if(a[i] > max) {
            		max = a[i];
            	}
            	
            	sum += a[i];
            }
            
            if(even == 0 || odd == 0) {
            	System.out.println(max);
            }else {
            	System.out.println(sum - (odd-1));
            }
        }
        input.close();
	}

}
