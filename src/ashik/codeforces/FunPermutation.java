package ashik.codeforces;

import java.util.Scanner;

public class FunPermutation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {

			int n = input.nextInt();

			int nn = n + 1;

			for (int i = 0; i < n; i++) {
				int p = input.nextInt();
				System.out.print((nn - p) + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
