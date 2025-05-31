package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OutstandingImpressionist {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {

			int n = input.nextInt();
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();

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
				if(size + 1 > mapSize) {
					output.append("1");
					continue;
				}
				
				for (int j = l[i]; j <= r[i]; j++) {

					
					if (map.containsKey(j)) {

						Integer value = map.get(j);
						if (value == Integer.MAX_VALUE) {
							if (j == r[i]) {
								output.append("0");
								break;
							}
							continue;
						} else {
							if (value == i) {
								output.append("1");
							} else {
								if (j == r[i]) {
									output.append("0");
									break;
								}
								continue;
							}
						}
					} else {
						output.append("1");
						break;
					}
				}
			}
			System.out.println(output.toString());
		}
		input.close();
	}

}
