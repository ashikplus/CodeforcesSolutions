package ashik.codeforces;

import java.util.Scanner;

public class ToZero {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();

            n = n-k;
            int ans;
            
            if(k%2 == 0) {
            	double ceil = Math.ceil((double) n/k);
            	ans = (int) ceil;
            }else {
            	double ceil = Math.ceil((double) n / (k-1));
            	ans = (int) ceil;
            }
            
            System.out.println(ans+1);
        }
        
        input.close();
	}

}
