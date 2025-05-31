package ashik.codeforces;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SkibidusandSigma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int m = input.nextInt();

			long[][] aij = new long[n][m];
			Map<Integer, Long> map = new HashMap<Integer, Long>();

			long sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					aij[i][j] = input.nextLong();
					sum += aij[i][j];
				}
				map.put(i + 1, sum);
				sum = 0;
			}

			Map<Integer, Long> sortedMap = map.entrySet().stream()
					.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors
							.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

			long grandSum = 0;
			long s = 0;
			for (Integer key : sortedMap.keySet()) {

				for (int a = 0; a < m; a++) {

					s += aij[key - 1][a];
					grandSum += s;
				}
			}
			System.out.println(grandSum);

		}
		input.close();
	}

}
