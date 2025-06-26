package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class FormingTriangles {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int[] a = new int[n];
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            Arrays.sort(a);
            
            int k = n-1;
            long count = 0;
            
            for(int i=n-1; i>0; i--) {
            	
            	long m = 1;
            	k--;
            	while(i>0 && a[i] == a[i-1]) {
            		
            		count += (long) k*m;
            		i--;
            		m++;
            		k--;
            	}
            }
            
            System.out.println(count);
        }
        input.close();
	}

}
