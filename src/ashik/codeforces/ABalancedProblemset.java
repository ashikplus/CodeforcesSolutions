package ashik.codeforces;

import java.util.Scanner;

public class ABalancedProblemset {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int x = input.nextInt();
			int n = input.nextInt();

			int y = x / n;

			int ans = greatestDivisorLessThanOrEqualToY(x, y);
			System.out.println(ans);
		}
		input.close();
	}

	private static int greatestDivisorLessThanOrEqualToY(int x, int y) {
		int maxDivisor = 1;

		for (int i = 1; i * i <= x; i++) {
			if (x % i == 0) {
				if (i <= y) {
					maxDivisor = Math.max(maxDivisor, i);
				}
				int pairDiv = x / i;
				if (pairDiv <= y) {
					maxDivisor = Math.max(maxDivisor, pairDiv);
				}
			}
		}

		return maxDivisor;
	}
}
