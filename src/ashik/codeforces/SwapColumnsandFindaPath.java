package ashik.codeforces;

import java.util.Scanner;

public class SwapColumnsandFindaPath {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int max = -100001;
            long sum=0;
            
            int[] a = new int[n];
            int[] b = new int[n];
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            for(int i=0; i<n; i++) {
            	b[i] = input.nextInt();
            }
            
            for(int i=0; i<n; i++) {
            	long x = Math.max(a[i], b[i]);
            	int y = Math.min(a[i], b[i]);
            	if(y > max) {
            		max = y;
            	}
            	sum+=x;
            }
            
            System.out.println(sum+=max);
        }
        input.close();
	}

}
