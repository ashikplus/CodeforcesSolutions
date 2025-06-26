package ashik.codeforces;

import java.util.Scanner;

public class SlicetoSurvive {

	static int count = 2;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int row = input.nextInt();
			int column = input.nextInt();
			int a = input.nextInt();
			int b = input.nextInt();

			int up = a - 1;
			int down = row - a;

			int left = b - 1;
			int right = column - b;

			CountRow(up, down, row, 1);
			CountColumn(left, right, column, 2);

			int firstCount = count;
			count = 2;
			CountColumn(left, right, column, 1);
			CountRow(up, down, row, 2);
			int secondCount = count;

			System.out.println(Math.min(firstCount, secondCount));
			count = 2;
		}
		input.close();
	}

	private static int CountColumn(int left, int right, int column, int i) {

		if (i == 1) {
			int minC = Math.min(left, right);
			column = minC + 1;
		} else {
			column = (int) Math.ceil((double) column / 2);
		}

		while (column > 1) {
			count++;
			column = (int) Math.ceil((double) column / 2);
		}
		return count;
	}

	private static int CountRow(int up, int down, int row, int i) {

		if (i == 1) {
			int minR = Math.min(up, down);
			row = minR + 1;
		} else {
			row = (int) Math.ceil((double) row / 2);
		}

		while (row > 1) {
			count++;
			row = (int) Math.ceil((double) row / 2);
		}
		return count;

	}

}
