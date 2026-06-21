package ashik.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BuyingShovels {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            long n = input.nextLong();
            long k = input.nextLong();

            List<Long> divisors = new ArrayList<>();

            for (long i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    if (i != n / i) { 
                        divisors.add(n / i);
                    }
                }
            }

            divisors.sort(Collections.reverseOrder());
            
            for(long div : divisors) {
            	if(div <= k) {
            		if(n % div == 0) {
            			System.out.println(n/div);
            			break;
            		}
            	}
            }
            
        }
        input.close();
	}

}
