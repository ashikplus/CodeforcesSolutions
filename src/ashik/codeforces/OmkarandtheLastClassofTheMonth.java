package ashik.codeforces;

import java.util.Scanner;

public class OmkarandtheLastClassofTheMonth {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {

			long n = input.nextLong();

			long greatestDivisor = findGreatestDivisor(n);

			if (greatestDivisor == -1) {
				n--;
				System.out.println(1 + " " + n);
			} else {
				long remain = n - greatestDivisor;
				System.out.println(greatestDivisor + " " + remain);
			}

		}

		input.close();
	}

	public static long findGreatestDivisor(long n) {
        if (n <= 3) return -1;

        long greatest = -1;
        long sqrt = (long) Math.sqrt(n);
        System.out.println(sqrt);

        for (long i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                long other = n / i;
                // both i and n/i are divisors; take the larger one (except n itself)
                if (other != n) greatest = Math.max(greatest, other);
                if (i != n) greatest = Math.max(greatest, i);
            }
        }

        return greatest == n || greatest == 1 ? -1 : greatest;
    }

}
