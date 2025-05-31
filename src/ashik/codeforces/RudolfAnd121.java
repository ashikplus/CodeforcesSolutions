package ashik.codeforces;

import java.util.Scanner;

public class RudolfAnd121 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int[] a = new int[n];
            boolean track = false;
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            for(int i=1; i<=n-2; i++) {
            	
            	if(a[i] >= a[i-1] * 2) {
            		a[i] -= a[i-1]*2;
            		a[i+1] -=  a[i-1];
            		a[i-1] -=  a[i-1];
            	}else {
            		System.out.println("No");
            		track = true;
            		break;
            	}
            }
            
            if(track == false) {
            	if(a[n-1] == 0 && a[n-2] == 0) {
                	System.out.println("yes");
                }else {
                	System.out.println("No");
                }
            }
        }
        input.close();
	}

}
