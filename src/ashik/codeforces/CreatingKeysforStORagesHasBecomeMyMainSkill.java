package ashik.codeforces;

import java.util.Scanner;

public class CreatingKeysforStORagesHasBecomeMyMainSkill {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			long x = input.nextLong();
			long orVal = 0;
			long count = 1;

			if (n == 1) {
				System.out.println(x);
				continue;
			} else {

				int i = 1;
				int size = 1;
				System.out.print(0 + " ");
				outer: for (int bit = 0; bit < 30; bit++) {

					if ((x >> bit & 1) == 1) {

						size = size * 2;
						for (; i < size; i++) {

							count++;
							orVal = orVal | i;
							if (orVal == x) {
								System.out.print(i + " ");
								i++;
								orVal = orVal|i;
								while (i < size-1 && orVal == x && count != n) {
									System.out.print(i + " ");
									count++;
									i++;
									orVal = orVal | i;
								}
								break outer;
							} else if (orVal > x) {
								break outer;
							} else if (count == n && orVal < x) {
								count--;
								break outer;
							} else if (orVal < x) {
								System.out.print(i + " ");
							}
						}
					} else {
						break;
					}
				}

				for (int j = 0; j < n - count; j++) {
					System.out.print(x + " ");
				}
				System.out.println();
			}

		}
		input.close();
	}

}
