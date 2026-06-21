package ashik.codeforces;

import java.util.Scanner;

public class InhabitantoftheDeepSea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {

			long n = input.nextLong();
			long k = input.nextLong();
			long left = 0;
			long right = 0;

			long[] a = new long[(int) n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextLong();
			}

			if (k % 2 == 0) {
				left = k / 2;
				right = k / 2;
			} else {
				left = (k / 2) + 1;
				right = k / 2;
			}

			if (k == 1) {
				left = 1;
			}

			long leftRemain = 0;
			long sunk = 0;

			int i = 0;
			while (left > 0) {

				left -= a[i];
				if (left >= 0) {
					sunk++;
				} else {
					leftRemain = a[i] + left;
				}
				i++;
				if (sunk == n) {
					break;
				}
			}

			if (sunk == n) {
				System.out.println(sunk);
				continue;
			}

			long j = n - 1;
			while (right > 0) {

				right -= a[(int) j];
				if (right >= 0) {
					sunk++;
				} else {
					if (sunk == n - 1) {
						if (right + leftRemain >= 0) {
							sunk++;
						}
					}
				}
				j--;
				if (sunk == n) {
					break;
				}
			}

			System.out.println(sunk);

		}
		input.close();
	}

}
