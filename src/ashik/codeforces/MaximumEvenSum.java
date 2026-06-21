package ashik.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumEvenSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
        	
            long a = input.nextLong();
            long q = input.nextLong();
            
            List<Long> divisors = new ArrayList<>();

            for (long i = 1; i * i <= q; i++) {
                if (q % i == 0) {
                    divisors.add(i);
                    if (i != q / i) {
                        divisors.add(q / i);
                    }
                }
            }

            divisors.sort(Collections.reverseOrder());
            long ans = -1l;
            
            for (long d : divisors) {
                
            	long y = d*a;
            	long z = q/d;
            	
            	if((y+z) % 2 == 0) {
            		ans = y+z;
            		break;
            	}
            }
            
            System.out.println(ans);
            
        }
        input.close();
	}

}
