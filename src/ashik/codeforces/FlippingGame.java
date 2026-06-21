package ashik.codeforces;

import java.util.Scanner;

public class FlippingGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] a = new int[n];
		int f = 0;
		int ones = 0;
		int highScore = 0;
        
        for(int i=0; i<n; i++) {
        	a[i] = input.nextInt();
        	
        	if(a[i] == 1) {
        		if(f!=0) {
        			if(highScore < f) {
        				highScore = f;
        			}
        			f--;
        		}
        		ones++;
        	}else {
        		f++;
        	}
        }
        if(highScore < f) {
			highScore = f;
		}
        
        if(highScore == 0) {
        	System.out.println(ones-1);
        }else {
        	System.out.println((ones+highScore));
        }
        
        input.close();
	}

}
