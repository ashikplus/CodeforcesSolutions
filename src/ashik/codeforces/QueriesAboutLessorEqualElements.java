package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class QueriesAboutLessorEqualElements {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];

		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}

		Arrays.sort(a);

		for (int i = 0; i < m; i++) {
			b[i] = input.nextInt();

			int low = 0;
			int high = n - 1;

			while (low <= high) {
				int mid = low + (high - low) / 2;
				if (a[mid] <= b[i]) {
					low = mid + 1; 
				} else {
					high = mid - 1; 
				}
			}
			System.out.print(low+" ");
		}
		
		
		input.close();
	}

}
