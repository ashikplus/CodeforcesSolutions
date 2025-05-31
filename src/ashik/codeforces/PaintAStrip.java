package ashik.codeforces;

import java.util.Scanner;

public class PaintAStrip {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int four = 4;
			int count = 1;

			if (n == 1) {
				System.out.println(1);
			} else if (n <= 4) {
				System.out.println(2);
			} else {
				while (four < n) {
					count++;
					four = (four + 1) * 2;
				}
				System.out.println(++count);
			}
		}
		input.close();
	}

}
