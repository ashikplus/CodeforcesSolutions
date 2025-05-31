package ashik.codeforces;

import java.util.Scanner;

public class MedianMaximization {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int s = input.nextInt();
            
            double ceil = (double) n/2;
            
            
            int median = (int) Math.ceil(ceil);
            int diff = n - (median - 1);
            
            int res = s/diff;
            
            System.out.println(res);
        }
        
        input.close();
	}

}
