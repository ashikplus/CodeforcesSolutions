package ashik.codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MereArray {

	static int i = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];

			for (int x = 0; x < n; x++) {
				a[x] = input.nextInt();
			}

			Map<Integer, List<Integer>> map = new HashMap<>();

			for (int y = 0; y < a.length; y++) {
				map.computeIfAbsent(a[y], k -> new ArrayList<>()).add(y + 1); // 1-based index
			}

			Arrays.sort(a);
			String ans = "YES";

			for (; i < n; i++) {

				if (a[i] % a[0] == 0) {
					continue;
				} else {
					List<Integer> list = map.get(a[i]);
					if (list.size() > 1) {

						boolean isOk = checkSequence(list, list.get(0));
						if (isOk) {
							continue;
						} else {
							ans = "NO";
						}

					} else {
						if (list.get(0) != i + 1) {
							ans = "NO";
							break;
						}
					}

				}
			}

			System.out.println(ans);
			i=0;
		}
		input.close();
	}

	private static boolean checkSequence(List<Integer> list, int val) {
		
		if(val != i+1) {
			return false;
		}

		for (int l = 1; l < list.size(); l++) {

			if (val == list.get(l) - 1) {
				val = list.get(l);
			} else {
				return false;
			}
			i++;
		}
		return true;

	}

}
