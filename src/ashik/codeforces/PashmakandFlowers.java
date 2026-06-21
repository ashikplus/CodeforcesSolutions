package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class PashmakandFlowers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		long n = input.nextLong();

		int[] a = new int[(int) n];

		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}

		Arrays.sort(a);
		int high = 0;
		int low = 0;

		int piv;
		piv = a[0];
		for (int i = 0; i < n; i++) {
			if (piv == a[i]) {
				high++;
			}
		}

		for (long i = n - 1; i >= 0; i--) {
			if (a[(int)n - 1] == a[(int)i]) {
				low++;
			}
		}

		long ans = 0;
		long diff = a[(int)n - 1] - a[0];

		if (high == n && low == n) {
			ans = (long)((n * (n - 1)) / 2);
		} else {
			ans = (long)high * low;
		}

		System.out.println(diff + " " + ans);
		
		input.close();
	}

}
