package ashik.codeforces;

import java.util.*;

public class StORageRoom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] m = new int[n][n];
			int[] arr = new int[n];

			Arrays.fill(arr, (1 << 30) - 1);

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					m[i][j] = sc.nextInt();
					if (i != j) {
						arr[i] &= m[i][j];
						arr[j] &= m[i][j];
					}
				}
			}

			boolean ok = true;
			for (int i = 0; i < n && ok; i++) {
				for (int j = 0; j < n; j++) {
					if (i != j && (arr[i] | arr[j]) != m[i][j]) {
						ok = false;
						break;
					}
				}
			}

			if (!ok) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
				for (int i = 0; i < n; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
		}

		sc.close();
	}
}
