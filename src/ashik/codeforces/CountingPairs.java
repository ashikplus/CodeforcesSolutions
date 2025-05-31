package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class CountingPairs {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			long x = input.nextLong();
			long y = input.nextLong();

			int[] a = new int[n];

			long sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
				sum += a[i];
			}

			Arrays.sort(a);
			long count = 0;

			outer: for (int i = 0, j = 0; i < n; i++) {

				j = i;
				while (j + 1 < n) {

					if (sum - (a[i] + a[j + 1]) > y) {
						j++;
						continue;
					}

					if (sum - (a[i] + a[j + 1]) >= x) {
						count++;

					} else {
						if ((j + 1) - i <= 2) {
							break outer;
						}
					}

					j++;
				}
			}
			System.out.println(count);
		}
		input.close();
	}

}
