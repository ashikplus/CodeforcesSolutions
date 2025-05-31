package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class TheThirdSide {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            int sum = Arrays.stream(a).sum();
            
            System.out.println(sum - (n-1));
        }
        
        input.close();
	}

}
