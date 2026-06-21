package ashik.codeforces;

import java.util.Scanner;

public class TripleOperations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int l = input.nextInt();
			int r = input.nextInt();

			int x = l;
			int y = 0;
			int count = 0;
			long sum = 0;

			while (x != 0) {
				x = x / 3;
				count++;
			}

			sum += count;

			int z = (int) Math.pow(3, count);

			while (true) {
				if (z < r) {
					int a = z - l;
					sum += (count * a);
					count++;
					l = z;
					z = (int) Math.pow(3, count);
				} else if (z > r) {
					int a = (r - l) + 1;
					sum += (count * a);
					break;
				} else {
					int a = z - l;
					sum += (count * a);
					count++;
					sum += count;
					break;
				}

			}
			System.out.println(sum);
		}
		input.close();
	}

}
