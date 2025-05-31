package ashik.codeforces;

import java.util.Scanner;

public class Crafting {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = input.nextInt();
			}
			int minPositive = Integer.MAX_VALUE;
			int maxNegative = Integer.MIN_VALUE;
			int minusCount = 0;
			int equalCount = 0;
			boolean reject = false;

			for (int i = 0; i < n; i++) {

				int diff = a[i] - b[i];

				if (diff < 0) {
					if (++minusCount > 1) {
						reject = true;
						break;
					}
					maxNegative = Math.max(maxNegative, diff);
				}

				else if (diff == 0) {
					equalCount++;
				} else { // diff > 0
					minPositive = Math.min(minPositive, diff);
				}

				if ((minusCount > 0 && equalCount > 0) || (maxNegative < 0 && minPositive != Integer.MAX_VALUE
						&& Math.abs(maxNegative) > minPositive)) {
					reject = true;
					break;
				}

			}
			
			System.out.println(reject ? "No" : "Yes");

		}
		input.close();
	}

}
