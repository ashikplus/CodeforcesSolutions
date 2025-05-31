package ashik.codeforces;

import java.util.Scanner;

public class PalindromicSubsequences {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        
        while (t-- > 0) {
            int n = input.nextInt();
            System.out.print(1+" ");
            
            double half = Math.ceil((double) n/2);
            for(int i=1; i<=half; i++) {
            	System.out.print(i+" ");
            }
            
            int size = (int) (n - (half+1));
            for(int j=1; j<=size; j++) {
            	System.out.print(j+" ");
            }
            System.out.println();
        }
        input.close();
	}

}
