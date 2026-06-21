package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VladandDivision {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];
			int ans = n;
			int intMax = Integer.MAX_VALUE;
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
				map.put(a[i], map.getOrDefault(a[i], 0) + 1);
			}

			for (int i = 0; i < n; i++) {
				if (!map.containsKey(a[i]))
					continue;
				int x = intMax - a[i];
				if (map.containsKey(x)) {

					ans--;
					if (map.get(a[i]) > 1) {
						map.put(a[i], map.get(a[i]) - 1);
					} else {
						map.remove(a[i]);
					}

					if (map.get(x) > 1) {
						map.put(x, map.get(x) - 1);
					} else {
						map.remove(x);
					}
				}
			}
			System.out.println(ans);
		}
		input.close();
	}

}
