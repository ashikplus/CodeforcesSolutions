package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationSystem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String s = input.next();

			if (map.containsKey(s)) {
				System.out.println(s+map.get(s));
				map.put(s, map.get(s) + 1);
			} else {
				System.out.println("OK");
				map.put(s, 1);
			}
		}
		input.close();
	}

}
