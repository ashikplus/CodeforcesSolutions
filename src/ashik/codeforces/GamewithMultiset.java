package ashik.codeforces;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class GamewithMultiset {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());

		while (m-- > 0) {

			int t = input.nextInt();
			int v = input.nextInt();
			long k = 0;

			if (t == 1) {
				map.put(v, map.getOrDefault(v, 0) + 1);

			} else {
				if (v == 0) {
					System.out.println("YES");
					continue;
				} else if (map.size() == 0) {
					System.out.println("NO");
					continue;
				}

				if (v % 2 == 1) {
					if (!map.containsKey(0)) {
						System.out.println("NO");
						continue;
					}
				}

				int size = map.size();
				int i = 0;
				outer: for (int key : map.keySet()) {

					i++;

					long x = (long) Math.pow(2, key);

					int n = map.get(key);
					
					if(x > v) {
//						continue;
					}else {
						long res = v/x;
						
						if(res > map.get(key)) {
							v -= map.get(key) * x;
						}else {
							v -= res*x;
						}
						
						if(v==0) {
							System.out.println("YES");
							break;
						}
					}

					if (i == size) {
						System.out.println("NO");
						break outer;
					}
				}

			}

		}

		input.close();
	}

}
