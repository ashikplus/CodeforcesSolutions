package ashik.codeforces;

import java.util.Scanner;

public class CombinationLock {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
           
            if(n%2 == 0) {
            	System.out.println(-1);
            	continue;
            }
        
            for(int i=n; i>=1; i--) {
            	System.out.print(i+" ");
            }
            System.out.println();
        }
        input.close();
	}

}
