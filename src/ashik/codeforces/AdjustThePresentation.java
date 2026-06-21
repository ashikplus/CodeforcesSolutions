package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdjustThePresentation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int m = input.nextInt();
			int q = input.nextInt();

			int[] a = new int[n + 1];
			int[] b = new int[m + 1];

			for (int i = 1; i <= n; i++) {
				a[i] = input.nextInt();
			}

			Map<Integer, Integer> aMap = new HashMap<Integer, Integer>();

			for (int i = 1; i <= n; i++) {
				aMap.put(a[i], i);
			}

			int x = 0;
			String ans = "YA";

			for (int i = 1; i <= m; i++) {
				b[i] = input.nextInt();

				if ((aMap.get(b[i]) - x) > 1) {
					ans = "TIDAK";
//					break;
				} else if ((aMap.get(b[i]) - x) == 1) {
					x = aMap.get(b[i]);
				}
			}

			System.out.println(ans);

		}
		input.close();
	}

}
