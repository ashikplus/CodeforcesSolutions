package ashik.codeforces;

import java.util.Scanner;

public class AlternatingSubsequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			int pos = Integer.MIN_VALUE;
			int neg = Integer.MIN_VALUE;
			long sum = 0;

			for (int i = 0; i < n;) {
				if (a[i] > 0) {
					while (i < n && a[i] > 0) {
						if (a[i] > pos) {
							pos = a[i];
						}
						i++;
					}
					sum += pos;
				} else {
					while (i < n && a[i] < 0) {
						if (a[i] > neg) {
							neg = a[i];
						}
						i++;
					}
					sum += neg;
				}

				pos = Integer.MIN_VALUE;
				neg = Integer.MIN_VALUE;
			}
			System.out.println(sum);
		}
		input.close();
	}

}
//dormosha, kolokkhina, poipaita