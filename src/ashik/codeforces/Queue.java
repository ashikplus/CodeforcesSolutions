package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int[] t = new int[n];

		for (int i = 0; i < n; i++) {
			t[i] = input.nextInt();
		}

		Arrays.sort(t);

		long sum = t[0];
		int count = 1;

		for (int i = 1; i < n; i++) {

			if (sum <= t[i]) {
				count++;
				sum += t[i];
			}
		}
		System.out.println(count);
		input.close();
	}

}
