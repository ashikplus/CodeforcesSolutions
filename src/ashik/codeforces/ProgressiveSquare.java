package ashik.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgressiveSquare {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			long c = input.nextLong();
			long d = input.nextLong();

			long[] b = new long[n];
			boolean track = false;

			List<Integer> list = new ArrayList<Integer>();
			int min = 2147483647;

			for (int i = 0; i < n * n; i++) {
				int value = input.nextInt();
				if (value < min) {
					min = value;
				}
				list.add(value);
			}

			int j = min;
			int top = 0;
			int x = n;
			outer:
			while (n > 0) {
				top = j;
				int down = top;
				int k = x;
				while (k > 0) {
					
					if (list.contains(down)) {
						list.remove(Integer.valueOf(down));
					} else {
						System.out.println("No");
						track = true;
						break outer;
					}
					down += c;
					k--;
				}

				j += d;
				n--;
			}
			if (track == false) {
				System.out.println("Yes");
			}
		}

		input.close();
	}

}
