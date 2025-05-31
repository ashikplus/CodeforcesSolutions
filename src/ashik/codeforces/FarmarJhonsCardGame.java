package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class FarmarJhonsCardGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int m = input.nextInt();
			int[] p = new int[n];
			boolean track = false;

			for (int i = 0; i < n; i++) {
				int p1 = input.nextInt();
				int rem1 = p1 % n;
				p[rem1] = i + 1;
				for (int j = 1; j < m; j++) {
					int p2 = input.nextInt();
					int rem2 = p2 % n;
					if (rem1 != rem2) {
						if (track == false) {
							System.out.println("-1");
							track = true;
						}
					}
				}
			}
			if (track == false) {
				String result = Arrays.stream(p).mapToObj(String::valueOf).reduce((a, b) -> a + " " + b).orElse("");
				System.out.println(result);
			}
		}
		input.close();
	}

}
