package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			long n = input.nextLong();
			long q = input.nextLong();
			Map<Long, Long> map = new HashMap<Long, Long>();

			long[] x = new long[(int)n + 1];
			long[] k = new long[(int)q];

			for (int i = 1; i <= n; i++) {
				x[i] = input.nextLong();
			}

			long a = n;
			long size = n / 2;
			if (n % 2 == 1) {

				long segments = ((size + 1) * size) + size;

				map.put(segments, 1l);
			}
			for (int i = 1; i <= size; i++) {

				long prev = i - 1;
				long after = n - i;
				long value = 0;

				long segments = ((after + 1) * prev) + after;

				map.put(segments, map.getOrDefault(segments, 0l) + 2l);
				long segments1 = segments - prev;
				if (i == size && n % 2 != 1) {
					value = (long) x[i + 1] - x[i];
					value -= 1l;
				} else {
					value = (long) x[i + 1] - x[i] + x[(int)a] - x[(int)a - 1];
					value -= 2l;
				}

				a--;
				map.put(segments1, map.getOrDefault(segments1, 0l) + value);
			}
			
			StringBuilder builder = new StringBuilder();
			for(int i=0; i<q; i++) {
				long b = input.nextLong();
				
				if(map.get(b) == null) {
					builder.append("0");
				}else {
					builder.append(map.get(b));
				}
				builder.append(" ");
			}
			System.out.println(builder.toString());

		}
		input.close();
	}

}
