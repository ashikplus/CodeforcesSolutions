package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class NewGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int k = input.nextInt();

			int[] a = new int[n];
			TreeMap<Integer, Integer> map = new TreeMap<>();
			TreeMap<Integer, Integer> map1 = new TreeMap<>();

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			Arrays.sort(a);

			int x = 0;
			for (int i = 0; i < n; i++) {

				if (map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i]) + 1);
				} else {
					map.put(a[i], 1);
					map1.put(x, a[i]);
					x++;
				}
			}

			Integer firstKey = map.firstKey();
			long ans = 0;
			long max = Integer.MIN_VALUE;
			int y = -1;
			int j = 1;

			for (int key : map.keySet()) {
				
				y++;
				if (key == firstKey || key == firstKey + 1) {

					if (j <= k) {

						ans += map.get(key);
						if (ans > max) {
							max = ans;
						}
						j++;

					} else {

						ans += map.get(key);

						int b = y - k;
						ans -= map.get(map1.get(b));
						if (ans > max) {
							max = ans;
						}
					}
				} else {
					j = 2;
					ans = 0;
					ans += map.get(key);
					if (ans > max) {
						max = ans;
					}
					
				}
				firstKey = key;
			}
			System.out.println(max);

		}
		input.close();
	}

}
