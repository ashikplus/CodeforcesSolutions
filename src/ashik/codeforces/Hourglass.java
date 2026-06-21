package ashik.codeforces;

import java.util.Scanner;

public class Hourglass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int s = input.nextInt();
			int k = input.nextInt();
			int m = input.nextInt();
			int a = 0, b = 0;

			if (s > k && s >= m && k <= m) {
				a = m % k;
				b = s - a;
			} else if (s > k && s > m) {
				b = s - m;
			} else if (k > s && k > m && s <= m) {
				b = 0;
			} else if (k > s && k > m && s > m) {
				b = s - m;
			} else if (m >= s && m >= k) {
				a = m % k;
				if (a >= s) {
					b = 0;
				} else {
					b = s - a;
				}
			}

			System.out.println(b);
		}
		input.close();
	}

}
