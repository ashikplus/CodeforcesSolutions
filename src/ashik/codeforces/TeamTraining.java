package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class TeamTraining {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();
            
            long[] a = new long[n];
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            Arrays.sort(a);
            
            long count = Arrays.stream(a).filter(num -> num >= x).count();
            long size = n - count;
            long diff = 2;
            
            for(long i=size-2; i>=0; i=i-diff) {
            	
            	while(i >= 0 && a[(int) i] * diff < x ) {
            		i--;
            		diff++;
            	}
            	
            	if(i<0) {
            		break;
            	}
            	
            	if(a[(int) i] * diff >= x ) {
            		count++;
            	}
            }
            
            System.out.println(count);
        }
        input.close();
	}

}
