package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class _378QAQandMochasArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			Arrays.sort(a);
			int count = 1;
			boolean check = false;
			int checkVal = 0;
			boolean track = false;

			for (int i = 1; i < n; i++) {

				if (a[i] % a[0] == 0 || (check && a[i] % checkVal == 0)) {

				} else {
					count++;
					if (count == 3) {
						System.out.println("No");
						track = true;
						break;
					}
					check = true;
					checkVal = a[i];
				}
			}
			if (track == false) {
				System.out.println("Yes");
			}
		}
		input.close();
	}

}
