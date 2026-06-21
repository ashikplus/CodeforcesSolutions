package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KousukesAssignment {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];
			Map<Long, Long> map = new HashMap<Long, Long>();
			map.put(0l, null);

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			long sum = 0;
			int count = 0;
			for (int i = 0; i < n; i++) {
				sum += a[i];
				if (map.containsKey(sum)) {
					count++;
					map = new HashMap<Long, Long>();
					map.put(0l, null);
					sum = 0;
				} else {
					map.put(sum, null);
				}
			}
			System.out.println(count);

		}
		input.close();
	}

}
