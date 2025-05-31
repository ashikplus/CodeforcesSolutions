package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class GamerHemose {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int h = input.nextInt();

			long[] a = new long[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			Arrays.sort(a);

			long sum = a[n - 1] + a[n - 2];
			long ans = h / sum;
			long rem = h % sum;

			if (rem > a[n - 1]) {
				System.out.println((ans * 2) + 2);
			} else if (rem != 0) {
				System.out.println((ans * 2) + 1);
			} else {
				System.out.println((ans * 2));
			}
		}
		input.close();
	}

}
