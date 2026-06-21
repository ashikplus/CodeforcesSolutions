package ashik.codeforces;

import java.util.Scanner;

public class RandomTeams {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		long n = input.nextLong();
		long m = input.nextLong();

		long a = n - (m - 1);

		long b = a * (a - 1) / 2;

		long c = n / m;

		long d = n % m;

		long e = m - d;

		long f = c * (c - 1) / 2;

		long g = f * e;

		c++;
		long h = c * (c - 1) / 2;

		long i = h * d;
		
		System.out.println((i+g) +" "+b);
		input.close();
	}

}
