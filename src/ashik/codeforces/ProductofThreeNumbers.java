package ashik.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductofThreeNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			List<Integer> divisors = new ArrayList<>();

			if (n <= 2) {
				System.out.println("NO");
				continue;
			}

			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					divisors.add(i);
					if (i != n / i) {
						divisors.add(n / i);
					}
				}
			}

			Collections.sort(divisors);

			if (divisors.size() < 3) {
				System.out.println("NO");
				continue;
			}

			long a = divisors.get(0);
			long b = divisors.get(1);
			long c = a * b;
			long d = 0;
			boolean yes = false;

			for (int i = 2; i < divisors.size(); i++) {
				d = divisors.get(i);

				if (c * d == n) {
					yes = true;
					break;
				}
			}

			if (yes) {
				System.out.println("YES");
				System.out.println(a + " " + b + " " + d);
			} else {
				System.out.println("NO");
			}
		}
		input.close();
	}

}
