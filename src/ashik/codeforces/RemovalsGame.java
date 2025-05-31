package ashik.codeforces;

import java.util.Scanner;

public class RemovalsGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = input.nextInt();
			}

			int size = n / 2;
			boolean track = false;

			for (int i = 0, k=n, j=0; i < size;) {
				if ((a[i] == b[j] || a[i] == b[n - 1]) && (a[k - 1] == b[j] || a[k - 1] == b[n - 1])) {
					if(a[i] == b[j]) {
						i++;
						j++;
					}else {
						i++;
						n--;
					}
				} else {
					System.out.println("Alice");
					track = true;
					break;
				}
			}
			if (track == false) {
				System.out.println("Bob");
			}
		}
		input.close();
	}

}
