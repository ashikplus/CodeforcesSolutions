package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class InterestingRatio {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			boolean[] isPrime = new boolean[n + 1];
			Arrays.fill(isPrime, true);

			isPrime[0] = false;
			isPrime[1] = false;

			for (int i = 2; i * i <= n; i++) {
				if (isPrime[i]) {
					for (int j = i * i; j <= n; j += i)
						isPrime[j] = false;
				}
			}

			int count = 0;
			for (int i = 2; i <= n; i++) {
				if (isPrime[i]) {
					count += (n / i);
				}
			}
			
			System.out.println(count);
		}
		input.close();
	}

}
