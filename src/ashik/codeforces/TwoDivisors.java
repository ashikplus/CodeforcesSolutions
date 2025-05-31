package ashik.codeforces;

import java.util.Scanner;

public class TwoDivisors {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int a = input.nextInt();
			int b = input.nextInt();

			if (b % a == 0) {
				System.out.println(b * (b / a));
			} else {
				System.out.println(b * (a / gcd(a, b)));
			}
		}
		input.close();

	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}
