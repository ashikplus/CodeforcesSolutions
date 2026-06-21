package ashik.codeforces;

import java.util.Scanner;

public class ArrowPath {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			input.nextLine();

			String s1 = input.nextLine();
			String s2 = input.nextLine();

			int s1Size = s1.length();
			int s2Size = s2.length();
			int breakPoint = 0;

			for (int i = 1; i < n - 1; i += 2) {

				if (s1.charAt(i) == '<') {
					breakPoint = i;
					break;
				}
			}

			String ans = "Yes";

			if (breakPoint == 0) {
				if (s2.charAt(s2Size - 2) == '<') {
					ans = "No";
				} else {
					ans = "Yes";
				}
			} else {

				for (int i = breakPoint - 1; i < n - 1; i += 2) {
					if (s2.charAt(i) == '<') {
						ans = "No";
						break;
					}
				}
			}

			System.out.println(ans);
		}
		input.close();
	}

}
