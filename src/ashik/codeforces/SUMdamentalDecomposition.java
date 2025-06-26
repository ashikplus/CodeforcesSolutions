package ashik.codeforces;

import java.util.Scanner;

public class SUMdamentalDecomposition {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int x = input.nextInt();
			int activeBit = 0;

			if (n == 1 && x == 0) {
				System.out.println(-1);
				continue;
			}

			// confusion
			if (x == 0 && n % 2 == 0) {
				System.out.println(n);
				continue;
			}

			if (x == 0) {
				int b = n - 2;
				System.out.println(5 + b);
				continue;
			}

			for (int i = 0; i < 32; i++) {
				if ((x & (1 << i)) != 0) {
					activeBit++;
				}
			}

			if (n <= activeBit) {
				System.out.println(x);
				continue;
			}

			if (x % 2 == 0) {
				int a = n - activeBit;
				if (a % 2 == 0) {
					System.out.println(x + a);
				} else {
					System.out.println(x + a + 1);
				}

			} else {
				int a = n - activeBit;
				if (a % 2 == 0) {
					System.out.println(x + a);
				} else {

					if (x == 1) {
						System.out.println((n-1)+4);
					} else {
						System.out.println(x + a + 1);
					}
				}
			}
		}
		input.close();
	}

}
