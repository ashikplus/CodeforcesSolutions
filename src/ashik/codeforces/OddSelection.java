package ashik.codeforces;

import java.util.Scanner;

public class OddSelection {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int x = input.nextInt();

			int[] a = new int[n];
			int odd = 0;
			int even = 0;

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
				if (a[i] % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}

			if (odd == 0) {
				System.out.println("NO");
			} else if (odd % 2 == 0 && n == x) {
				System.out.println("NO");
			} else if (even == 0 & x % 2 == 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
		input.close();
	}

}
