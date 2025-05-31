package ashik.codeforces;

import java.util.Scanner;

public class TheStrictTeacher {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int m = input.nextInt();
			int q = input.nextInt();

			int[] b = new int[2];
			int[] a = new int[1];

			for (int i = 0; i < 2; i++) {
				b[i] = input.nextInt();
			}
			for (int i = 0; i < 1; i++) {
				a[i] = input.nextInt();
			}

			if (a[0] > b[0] && a[0] > b[1]) {
				int ans = n - Math.max(b[0], b[1]);
				System.out.println(ans);
			} else if (a[0] < b[0] && a[0] < b[1]) {
				int ans = Math.min(b[0], b[1]) - 1;
				System.out.println(ans);
			} else {
				int big;
				int small;

				if (b[0] > b[1]) {
					big = b[0];
					small = b[1];
				} else {
					big = b[1];
					small = b[0];
				}

				if (big - a[0] == a[0] - small) {
					System.out.println(big - a[0]);
				} else {

					int x = a[0] - small;
					int y = (big - (x - 1)) - a[0];

					int res = (int) Math.ceil((double) y / 2);

					System.out.println((x + res) - 1);
				}

			}
		}
		input.close();
	}

}
