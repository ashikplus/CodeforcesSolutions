package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class BerSUBall {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}

		int m = input.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = input.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		int ans = 0;

		for (int i = 0, j = 0;;) {
			int z = a[i] - b[j];
			if (Math.abs(z) == 0 || Math.abs(z) == 1) {
				ans++;
				i++;
				j++;

			} else {
				if (a[i] > b[j]) {
					j++;
				} else {
					i++;
				}
			}
			if (i >= a.length || j >= b.length) {
				break;
			}
		}
		System.out.println(ans);
		input.close();

	}

}
