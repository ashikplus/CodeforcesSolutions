package ashik.codeforces;

import java.util.Scanner;
import java.util.TreeMap;

public class TheStrictTeacherHardVersion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int m = input.nextInt();
			int q = input.nextInt();

			int[] b = new int[m];
			int[] a = new int[q];

			TreeMap<Integer, Integer> mMap = new TreeMap<Integer, Integer>();

			for (int i = 0; i < m; i++) {
				mMap.put(input.nextInt(), null);
			}

			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < q; i++) {

				int x = input.nextInt();

				Integer leftKey = mMap.lowerKey(x);
				Integer rightKey = mMap.higherKey(x);

				if (leftKey == null) {
					sb.append(rightKey - 1);
				} else if (rightKey == null) {
					sb.append(n - leftKey);
				} else {
					int ans = (x - leftKey) + (rightKey - x);
					sb.append(ans / 2);
				}
				sb.append("\n");
			}
			System.out.println(sb.toString());
		}
		input.close();
	}

}
