package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SetofStrangers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int m = input.nextInt();

			int[][] aij = new int[n][m];
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					aij[i][j] = input.nextInt();
				}
			}

			map.put(aij[0][0], 1);

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {

					if (map.containsKey(aij[i][j])) {
						if (map.get(aij[i][j]) == 1) {

							int c = 0;
							int d = 0;
							if(i < n - 1){
								c = aij[i + 1][j];
								d = map.get(aij[i][j]);
							}
							
							if ((j < m - 1 && aij[i][j + 1] == aij[i][j])
									|| (i < n - 1 && aij[i + 1][j] == aij[i][j])
									|| (i > 0 && aij[i - 1][j] == aij[i][j])
									|| (j > 0 && aij[i][j - 1] == aij[i][j])) {
								
								map.put(aij[i][j], 2);
							}
						} else {
							continue;
						}
					} else {
						map.put(aij[i][j], 1);
					}

				}
			}

			int sum = 0;
			int sub = 1;
			for (int value : map.values()) {
				if (value == 2) {
					sub = 2;
				}
				sum += value;
			}
			System.out.println(sum - sub);
		}
		input.close();
	}

}
