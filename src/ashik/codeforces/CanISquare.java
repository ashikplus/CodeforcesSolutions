package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class CanISquare {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			long sum = Arrays.stream(a).asLongStream().sum();

			long sqrt = (long)Math.sqrt(sum);

			if (sqrt * sqrt == sum) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		input.close();
	}
}
