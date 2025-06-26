package ashik.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InsertandEqualize {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			long[] a = new long[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextLong();
			}

			if (n == 1) {
				System.out.println(1);
				continue;
			}

			long compare = a[0];
			long diff = 0;
			long diff2 = 0;
			if (compare > a[1]) {
				diff = Math.abs(compare - a[1]);
			} else {
				diff = Math.abs(a[1] - compare);
			}

			long result = diff;
			int length = a.length;
			for (int i = 2; i < length; i++) {

				if (compare > a[i]) {
					diff2 = Math.abs(compare - a[i]);
				} else {
					diff2 = Math.abs(a[i] - compare);
				}

				result = gcd(result, diff2);

				if (result == 1) {
					break;
				}
			}

			Set<Long> set = new HashSet<Long>();
			long max = Integer.MIN_VALUE;

			for (int i = 0; i < length; i++) {
				if (a[i] > max) {
					max = a[i];
				}
				set.add(a[i]);
			}

			long count = 0;
			for (int i = 0; i < length; i++) {
				if (a[i] != max) {
					long x = Math.abs(max - a[i]);

					long res = x / result;
					count += res;
				}
			}

			long tax = max;
			long b = 0;

			for (int i = 0; i < n; i++) {

				tax = tax - result;
				b++;
				if (!set.contains(tax)) {
					break;
				}
			}
			
			System.out.println(count+b);

		}
		input.close();
	}

	public static long gcd(long a, long b) {
		while (b != 0) {
			long tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}

}
