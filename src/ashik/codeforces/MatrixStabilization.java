package ashik.codeforces;

import java.util.Scanner;

public class MatrixStabilization {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int m = input.nextInt();

			int[][] aij = new int[n][m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					aij[i][j] = input.nextInt();
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int top = 0;
					if (i - 1 >= 0) {
						if (aij[i][j] > aij[i - 1][j]) {
							if (top < aij[i - 1][j]) {
								top = aij[i - 1][j];
							}
						} else {
							continue;
						}
					}

					if (j + 1 < m) {
						if (aij[i][j] > aij[i][j + 1]) {
							if (top < aij[i][j + 1]) {
								top = aij[i][j + 1];
							}
						} else {
							continue;
						}
					}

					if (i + 1 < n) {
						if (aij[i][j] > aij[i + 1][j]) {
							if (top < aij[i + 1][j]) {
								top = aij[i + 1][j];
							}
						} else {
							continue;
						}
					}

					if (j - 1 >= 0) {
						if (aij[i][j] > aij[i][j - 1]) {
							if (top < aij[i][j - 1]) {
								top = aij[i][j - 1];
							}
						} else {
							continue;
						}
					}

					aij[i][j] = top;
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(aij[i][j] + " ");
				}
				System.out.println();
			}

		}
		input.close();
	}

}
