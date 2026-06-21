package ashik.codeforces;

import java.util.Scanner;
import java.util.TreeMap;

public class MEXGame1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
				map.put(a[i], map.getOrDefault(a[i], 0) + 1);
			}

			int i = 0;
			int mex = 0;
			boolean found = false;
			int dec = 2;
			int count = 0;

			for (int key : map.keySet()) {

				if (key != i) {
					mex = i;
					found = true;
					break;
				} else if (map.get(key) < dec) {
					count++;
					if (count > 1) {
						break;
					}
				}
				i++;
				mex = key;

			}

			if (!found) {
				mex = mex + 1;
			}
			System.out.println(mex);
		}
		input.close();
	}

}
