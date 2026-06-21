package ashik.codeforces;

import java.util.Scanner;

public class CostoftheArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int k = input.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			int ans = 1;

			if (n - k == 0) {
				int ini = 1;
				int x = 2;
				for (int i = 1; i < n; i += 2) {
					if (a[i] == ini) {
						ans = x;
						ini++;
						x++;
					}else {
						break;
					}
				}
			} else {
				int one = 0;
				int val = n - k;
				int i = 1;
				while (i < n && a[i] == 1) {
					one++;
					i++;
					if (one >= (val + 1)) {
						ans = 2;
						break;
					}
				}

				if (one < (val + 1)) {
					ans = 1;
				}

			}
			System.out.println(ans);
		}
		input.close();
	}

}
