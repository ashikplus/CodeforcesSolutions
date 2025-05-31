package ashik.codeforces;

import java.util.Scanner;

public class LargeArrayAndSegments {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int k = input.nextInt();
			long x = input.nextLong();

			int[] a = new int[n];
			long sum = 0;
			long count = 0;

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
				sum += a[i];
			}

			int l = 0;
			long cum = sum;
			int m = 1;
			boolean track = false;

			if (sum >= x) {
				while (sum >= x && l < n) {
					count++;

					sum -= a[l];
					l++;
				}

				count = count + n * (k - 1);

				System.out.println(count);
				continue;
			} else {
				while (cum < x && m < k) {
					cum += sum;
					m++;

					if (m == k && cum < x) {
						System.out.println(0);
						track = true;
					}
				}
				if (track) {
					continue;
				}

				int i = 0;
				while (cum >= x && i < n) {
					count++;
					cum -= a[i];
					i++;
				}

				int diff = k - m;

				count += (diff * n);
				System.out.println(count);
			}

		}
		input.close();
	}

}
