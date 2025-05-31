package ashik.codeforces;

import java.util.Scanner;

public class Clockwork {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int[] a = new int[n];
            
            boolean track = true;
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            for(int i=0; i<n; i++) {
            	
            	double ceil = Math.ceil(n/2);
            	
            	if(i < ceil) {
            		int step = (n - (i+1)) * 2;
            		if(step >= a[i]) {
            			System.out.println("No");
            			track = false;
            			break;
            		}
            	}else {
            		int stepBack = i*2;
            		if(stepBack >= a[i]) {
            			System.out.println("No");
            			track = false;
            			break;
            		}
            	}
            	
            }
            if(track) {
            	System.out.println("Yes");
            }
        }
        input.close();
	}

}
