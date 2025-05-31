package ashik.codeforces;

import java.util.Scanner;

public class GamewithDoors {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int l = input.nextInt();
			int r = input.nextInt();

			int L = input.nextInt();
			int R = input.nextInt();

			int left = Math.max(l, L);
			int right = Math.min(r, R);
			int count = 0;

			if (right >= left) {
				count = right - left;
				if (Math.min(l, L) < left) {
					count++;
				}
				if (Math.max(r, R) > right) {
					count++;
				}
				System.out.println(count);
			} else {
				System.out.println(1);
			}
		}
		input.close();
	}

}
