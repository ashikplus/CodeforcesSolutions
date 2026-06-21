package ashik.codeforces;

import java.util.Scanner;

public class SorttheArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}

		int i = 0;
		int b = a[i];
		int low = 0;
		int left = 0;
		int right = 0;

		while (i + 1 < n && b <= a[i + 1]) {
			b = a[i + 1];
			left = i + 1;
			i++;
		}

		while (left > 0 && a[left] == a[left - 1]) {
			left--;
		}

		if (left > 0) {
			low = a[left - 1];
		} else {
			low = a[left];
		}

		int j = left;
		int c = a[left];
		while (j + 1 < n && c >= a[j + 1] && a[j + 1] >= low) {

			c = a[j + 1];
			right = j + 1;
			j++;
		}

		int k = right + 1;
		int d = low;
		while (k < n && a[k] >= d) {

			d = a[k];
			k++;
		}

		if (left == n - 1) {
			System.out.println("yes");
			System.out.println(1 + " " + 1);
		} else if (k == n) {
			System.out.println("yes");
			System.out.println(left + 1 + " " + (right + 1));
		} else {
			System.out.println("no");
		}

		input.close();
	}

}
