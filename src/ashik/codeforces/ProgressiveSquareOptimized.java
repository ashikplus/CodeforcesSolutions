package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgressiveSquareOptimized {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			long c = input.nextLong();
			long d = input.nextLong();

			long[] b = new long[n];
			boolean track = false;

			Map<Long, Long> map = new HashMap<Long, Long>();
			long min = 2147483647;
			
			for (int i = 0; i < n * n; i++) {
				long value = input.nextInt();
				if (value < min) {
					min = value;
				}
				map.put(value, map.getOrDefault(value, (long) 0) + 1);
			}

			long j = min;
			long top = 0;
			int x = n;
			outer:
			while (n > 0) {
				top = j;
				long down = top;
				int k = x;
				while (k > 0) {
					
					if (map.containsKey(down)) {
						long newValue = map.get(down) - 1;
						if (newValue == 0) {
					        map.remove(down);
					    } else {
					        map.put(down, newValue);
					    }
					} else {
						System.out.println("No");
						track = true;
						break outer;
					}
					down += c;
					k--;
				}

				j += d;
				n--;
			}
			if (track == false) {
				System.out.println("Yes");
			}
		}

		input.close();
	}

}
