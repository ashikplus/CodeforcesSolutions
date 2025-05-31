package ashik.codeforces;

import java.util.Scanner;

public class BrightnessBegins {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            long k = input.nextLong();
            
            double sqrt = Math.sqrt(k);
            long count = (int) sqrt;
            
            long c = (count+1)*(count+1);
            
            if(c >= k+1 && c <= k+count) {
            	System.out.println(k+count+1l);
            }else {
            	System.out.println(k+count);
            }
            
        }
        input.close();
	}

}
