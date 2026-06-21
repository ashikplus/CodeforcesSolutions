package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SofiaandtheLostOperations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];
			int[] b = new int[n];
			Map<Integer, Integer> bMap = new HashMap<Integer, Integer>();
			Map<Integer, Integer> dMap = new HashMap<Integer, Integer>();
			Map<Integer, Integer> mustMap = new HashMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			for (int i = 0; i < n; i++) {
				b[i] = input.nextInt();
				bMap.put(b[i], 1);
			}

			int m = input.nextInt();

			int[] d = new int[m];

			for (int i = 0; i < m; i++) {
				d[i] = input.nextInt();
				dMap.put(d[i], dMap.getOrDefault(d[i], 0) + 1);
			}

			String ans = "YES";

			if (bMap.getOrDefault(d[m - 1], 0) == 0) {
				System.out.println("No");
				continue;
			}

			for (int i = 0; i < n; i++) {

				if (a[i] != b[i]) {

					mustMap.put(b[i], mustMap.getOrDefault(b[i], 0) + 1);
				}
			}

			for (Integer key : mustMap.keySet()) {

				Integer x = mustMap.get(key);
				Integer y = dMap.getOrDefault(key, 0);

				if (y >= x) {
					continue;
				} else {
					ans = "NO";
					break;
				}
			}

			System.out.println(ans);
		}
		input.close();
	}

}
