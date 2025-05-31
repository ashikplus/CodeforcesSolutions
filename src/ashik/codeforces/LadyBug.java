package ashik.codeforces;

import java.util.Scanner;

public class LadyBug {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			String a = input.next();
			String b = input.next();

			int pattern1 = 0;
			int pattern2 = 0;

			for (int i = 0; i < n; i += 2) {

				if (a.charAt(i) == '0') {
					pattern1++;
				}
				if (i + 1 < n && b.charAt(i + 1) == '0') {
					pattern1++;
				}

				if (b.charAt(i) == '0') {
					pattern2++;
				}

				if (i + 1 < n && a.charAt(i + 1) == '0') {
					pattern2++;
				}
			}
			
			if(pattern1 >= n-pattern1 && pattern2 >= (n-pattern2)-1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		input.close();
	}

}
