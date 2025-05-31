package ashik.codeforces;

import java.util.Scanner;

public class StChroma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
        	
        	int n = input.nextInt();
            int x = input.nextInt();
            
            for(int i=0; i<x; i++) {
            	System.out.print(i+" ");
            }
            
            for(int i=x+1; i<n; i++) {
            	System.out.print(i+" ");
            }
            
            if(x<n) {
            	System.out.print(x);
            }
            
            System.out.println();
        }
        
        input.close();
	}

}
