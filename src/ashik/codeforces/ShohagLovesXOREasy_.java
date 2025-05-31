package ashik.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ShohagLovesXOREasy_ {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            long x = input.nextLong();
            long m = input.nextLong();
            
            Set<Long> divisors = getAllDivisors(x);
            divisors.addAll(getAllDivisors(m));

            Set<Long> validI = new HashSet<>();

            for (long val : divisors) {
                long i = val ^ x;
                if (i >= 1 && i <= m) {
                    validI.add(i);
                }
            }

            System.out.println(validI.size());
        }
        input.close();
	}
	
	public static Set<Long> getAllDivisors(long n) {
        Set<Long> divisors = new HashSet<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        return divisors;
    }

}
