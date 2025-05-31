package ashik.codeforces;

import java.util.Scanner;

public class NenesGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int k = input.nextInt();
            int q = input.nextInt();
            
            int[] a = new int[k];
            int[] n = new int[q];
            
            for(int i=0; i<k; i++) {
            	a[i] = input.nextInt();
            }
            for(int i=0; i<q; i++) {
            	n[i] = input.nextInt();
            }
            
            for(int i=0; i<q; i++) {
            	
            	if(n[i] < a[0]) {
            		System.out.print(n[i]+" ");
            	}else {
            		System.out.print(a[0] - 1+" ");
            	}
            }
            System.out.println();
        }
        input.close();
	}

}
