package ashik.codeforces;

import java.util.Scanner;

public class PreparingForTheExam {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int m = input.nextInt();
			int k = input.nextInt();

			int[] a = new int[m];
			int[] q = new int[k];

			for (int i = 0; i < m; i++) {
				a[i] = input.nextInt();
			}
			for (int i = 0; i < k; i++) {
				q[i] = input.nextInt();
			}

			String ans = "";

			if (n - k > 1) {
				for (int i = 0; i < m; i++) {
					ans += "0";
				}
			} else if (n == k) {
				for (int i = 0; i < m; i++) {
					ans += "1";
				}
			} else {

				outerloop:
				for (int i = 0; i < m; i++) {

					while (k > i && i < m && q[i] == i + 1) {
						ans += "0";
						i++;
						if (i == m) {
							break outerloop;
						}

					}
					ans += "1";
					i++;
					for (; i < m; i++) {
						ans += "0";
					}

				}
			}

			System.out.println(ans);
		}
		input.close();
		;
	}

}
