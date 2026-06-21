package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRecoloring {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int k = input.nextInt();

			int[] a = new int[n];
			int max = Integer.MIN_VALUE;

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
				if (a[i] > max) {
					max = a[i];
				}
			}

			int left = a[0];
			int right = a[n - 1];
			long ans = 0;
			Arrays.sort(a);

			if (k == 1) {
				if (max == left || max == right) {
					ans = a[n-1] + a[n-2];
				} else {
					ans = a[n-1] + Math.max(left, right);
				}
			} else {
				for (int i = 1; i <= k+1; i++) {
					ans += a[n-i];
				}
			}

			System.out.println(ans);

		}
		input.close();
	}

}
