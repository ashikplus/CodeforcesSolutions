package ashik.codeforces;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class OutstandingImpressionistOptimized {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {

			int n = input.nextInt();
			SortedMap<Integer, Integer> map = new TreeMap<>();

			int[] l = new int[n];
			int[] r = new int[n];

			for (int i = 0; i < n; i++) {
				l[i] = input.nextInt();
				r[i] = input.nextInt();

				if (l[i] == r[i]) {
					if (map.containsKey(l[i])) {

						map.put(l[i], Integer.MAX_VALUE);

					} else {

						map.put(l[i], i);
					}
				}
			}

			int mapSize = map.size();

			StringBuilder output = new StringBuilder();
			for (int i = 0; i < n; i++) {

				int size = r[i] - l[i];
				if (size + 1 > mapSize) {
					output.append("1");
					continue;
				} else if (r[i] == l[i]) {
					Integer value = map.get(l[i]);
					if (value == Integer.MAX_VALUE) {
						output.append("0");
						continue;
					} else {
						output.append("1");
						continue;
					}
				}

				if (map.containsKey(l[i]) && map.containsKey(r[i])) {
					SortedMap<Integer, Integer> sub = ((TreeMap<Integer, Integer>) map).subMap(l[i], true, r[i], true);

					int subSize = sub.size();
					int sizee = r[i] - l[i];
					if (sizee + 1 == subSize) {
						output.append("0");
					} else {
						output.append("1");
					}

				} else {
					output.append("1");
				}

			}
			System.out.println(output.toString());
		}
		input.close();
	}

}
