package ashik.codeforces;

import java.util.Scanner;

public class KthBeautifulString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {

			long n = input.nextLong();
			long k = input.nextLong();

			long i = 1;

			long a = (long) (2 * Math.pow(10, 9));
			long b = (n * (n - 1)) / 2;
			long c = Math.min(a, b);
			k = Math.min(k, c);

			long sum = 0;

			for (i = 1;; i++) {
				sum += i;
				if (sum >= k) {
					break;
				}
			}

			long d = i * (i - 1) / 2;
			long diff = k - (d + 1);

			long x = n - (i + 1);
			long y = n - diff;
			y--;

			StringBuilder sb = new StringBuilder();

			for (long j = 0; j < n; j++) {
				if (j == x || j == y) {
					sb.append("b");
				} else {
					sb.append("a");
				}
			}

			System.out.println(sb.toString());

		}
		input.close();
	}

}
