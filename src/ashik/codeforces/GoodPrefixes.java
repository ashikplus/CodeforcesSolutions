package ashik.codeforces;

import java.util.Scanner;

public class GoodPrefixes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			long[] a = new long[n];
			long count = 0;
			long sum = 0;
			long highest = 0;
			long sumWithoutHighest = 0;
			boolean found = true;

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();

				if (((found || a[i]!=0) && a[i] == sum) || ((found || a[i]!=0) && sumWithoutHighest + a[i] == highest)) {

					count++;
					found = true;

				} else {
					found = false;
				}

				if (a[i] != 0) {
					sum = sum + a[i];

					if (a[i] > highest) {
						highest = a[i];
					}

					sumWithoutHighest = sum - highest;
				}

			}
			System.out.println(count);

		}
		input.close();
	}

}
