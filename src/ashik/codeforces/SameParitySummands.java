package ashik.codeforces;

import java.util.Scanner;

public class SameParitySummands {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int k = input.nextInt();

			if (n % 2 == 1 && k % 2 == 0) {
				System.out.println("NO");
			} else if (k > n) {
				System.out.println("NO");
			} else if (n % 2 == 0 && k > n / 2 && k % 2 == 1) {
				System.out.println("NO");
			} else if (n % 2 == 0) {
				int a = n / k;
				if (a * k == n) {
					System.out.println("YES");
					for (int i = 0; i < k; i++) {
						System.out.print(a + " ");
					}
					System.out.println();
				} else {
					if (a % 2 == 1) {
						if(a!=1) {
							a = a - 1;
							int b = a * (k - 1);
							int c = n - b;
							System.out.println("YES");
							for (int i = 0; i < k - 1; i++) {
								System.out.print(a + " ");
							}
							System.out.print(c);
							System.out.println();
						}else {
							int b = a * (k - 1);
							int c = n - b;
							System.out.println("YES");
							for (int i = 0; i < k - 1; i++) {
								System.out.print(a + " ");
							}
							System.out.print(c);
							System.out.println();
						}
						
					} else {
						int b = a * (k - 1);
						int c = n - b;
						System.out.println("YES");
						for (int i = 0; i < k - 1; i++) {
							System.out.print(a + " ");
						}
						System.out.print(c);
						System.out.println();
					}
				}
			} else {
				int a = n / k;
				if (a * k == n) {
					System.out.println("YES");
					for (int i = 0; i < k; i++) {
						System.out.print(a + " ");
					}
					System.out.println();
				} else {
					if (a % 2 == 0) {
						a = a - 1;
						int b = a * (k - 1);
						int c = n - b;
						System.out.println("YES");
						for (int i = 0; i < k - 1; i++) {
							System.out.print(a + " ");
						}
						System.out.print(c);
						System.out.println();
					} else {
						int b = a * (k - 1);
						int c = n - b;
						System.out.println("YES");
						for (int i = 0; i < k - 1; i++) {
							System.out.print(a + " ");
						}
						System.out.print(c);
						System.out.println();
					}
				}
			}
		}

		input.close();
	}

}
