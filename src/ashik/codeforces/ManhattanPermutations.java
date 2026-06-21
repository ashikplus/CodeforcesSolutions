package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManhattanPermutations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			long n = input.nextLong();
			long k = input.nextLong();

			Map<Long, Long> map = new HashMap<Long, Long>();
			boolean no = true;

			if (k == 0) {
				System.out.println("YES");
				for (long i = 1; i <= n; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
				continue;
			} else if (k % 2 == 1) {
				System.out.println("NO");
				continue;
			}

			long b = n;
			long e = 0;
			for (long i = 1; i <= n / 2; i++) {

				long d = b - i;
				d = d * 2;
				if (d < k) {
					map.put(i, b);
					map.put(b, i);
					k -= d;
				} else if (d > k) {

					e = k / 2;
					long f = i + e;
					map.put(i, f);
					map.put(f, i);
					no = false;
					break;
				} else {
					map.put(i, b);
					map.put(b, i);
					no = false;
					break;
				}
				b--;

			}

			if (no) {
				System.out.print("NO");
			} else {
				System.out.println("YES");
				for (long i = 1; i <= n; i++) {

					if (map.containsKey(i)) {
						System.out.print(map.get(i) + " ");
					} else {
						System.out.print(i + " ");
					}
				}
			}
			System.out.println();

		}
		input.close();
	}

}
