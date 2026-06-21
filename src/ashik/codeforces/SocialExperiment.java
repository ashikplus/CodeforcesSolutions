package ashik.codeforces;

import java.util.Scanner;

public class SocialExperiment {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int answer;
			if (n <= 3) {
				answer = n;
			} else if (n % 2 == 0) {
				answer = 0;
			} else {
				answer = 1;
			}

			System.out.println(answer);
		}
		input.close();
	}

}
