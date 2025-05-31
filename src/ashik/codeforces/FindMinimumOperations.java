package ashik.codeforces;

import java.util.Scanner;

public class FindMinimumOperations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int ans = 0;
            
            if(k==1) {
            	System.out.println(n);
            	continue;
            }
            
            while(n != 0) {
            	
            	ans += n%k;
            	n = n/k;
            }
            System.out.println(ans);
            
        }
        
        input.close();
	}

}
