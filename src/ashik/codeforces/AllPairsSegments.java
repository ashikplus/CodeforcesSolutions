package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllPairsSegments {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			long n = input.nextLong();
			long q = input.nextLong();
			Map<Long, Long> map = new HashMap<Long, Long>();

			long[] x = new long[(int)n];
			long[] k = new long[(int)q];

			for (int i = 0; i < n; i++) {
				x[i] = input.nextLong();
			}

			for (int i = 0; i < n-1; i++) {

				long sum = (i + 1) * (n - i) - 1;
				map.put(sum, map.getOrDefault(sum, 0L) + 1);
				sum = (i + 1) * (n - 1 - i);
				map.put(sum, map.getOrDefault(sum, 0L) + x[i + 1] - x[i] - 1);
			}
			map.put(n-1L,map.getOrDefault((n-1), 0L)+1);

			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < q; i++) {
				long b = input.nextLong();

				if (map.get(b) == null) {
					builder.append("0");
				} else {
					builder.append(map.get(b));
				}
				builder.append(" ");
			}
			System.out.println(builder.toString());

		}
		input.close();
	}

}
