package ashik.codeforces;

import java.util.Scanner;

public class MakeItUgly {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			int init = a[0];
			int count = 0;
			int min = Integer.MAX_VALUE;

			for (int i = 0; i < n; i++) {

				while (i < n && a[i] == init) {
					count++;
					i++;
				}

				if (count < min) {
					min = count;
				}
				count = 0;

			}

			System.out.println(min == n ? -1 : min);
		}
		input.close();
	}

}
