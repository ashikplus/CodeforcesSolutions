package ashik.codeforces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumericStringTemplate {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			int m = input.nextInt();
			Map<Character, Integer> keyMap = new HashMap<Character, Integer>();
			boolean track = false;
			input.nextLine();
			for (int i = 0; i < m; i++) {
				String s = input.next();
				track = false;
				keyMap.clear();
				if (s.length() == n) {
					for (int j = 0; j < n; j++) {
						char ch = s.charAt(j);
						int k = a[j];
						if (keyMap.containsValue(a[j])) {
							List<Character> keys = keyMap.entrySet().stream().filter(entry -> entry.getValue() == k)
									.map(Map.Entry::getKey).collect(Collectors.toList());

							if (ch != keys.get(0)) {
								System.out.println("No");
								track = true;
								break;
							}

						}
						if (keyMap.containsKey(ch)) {

							Integer value = keyMap.get(ch);
							if (value.intValue() != a[j]) {
								System.out.println("No");
								track = true;
								break;
							}
						} else {
							keyMap.put(ch, a[j]);
						}
					}
					if (track == false) {
						System.out.println("Yes");
					}
				} else {
					System.out.println("No");

				}
			}
		}
		input.close();
	}

}
