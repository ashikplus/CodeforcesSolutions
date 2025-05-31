package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class FinalVerdict {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            double x = input.nextDouble();
            
            int[] a = new int[n];
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            int sum = Arrays.stream(a).sum();
            
            double verdict = (double) sum/n;
            
            if(verdict == x) {
            	System.out.println("Yes");
            }else {
            	System.out.println("No");
            }
        }
        input.close();
	}

}
