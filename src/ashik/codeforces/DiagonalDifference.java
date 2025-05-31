package ashik.codeforces;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int[][] aij = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				aij[i][j] = input.nextInt();
			}
		}

		int leftDiagonal = 0;
		int rightDiagonal = 0;
		
		for (int a = 0; a < n; a++) {

			leftDiagonal += aij[a][a];
		}

		for (int b = 0, c = n - 1; b < n; b++, c--) {

			rightDiagonal += aij[b][c];
		}

		if(leftDiagonal > rightDiagonal) {
			System.out.println(Math.abs(leftDiagonal-rightDiagonal));
		}else {
			System.out.println(Math.abs(rightDiagonal-leftDiagonal));
		}

	}

}
