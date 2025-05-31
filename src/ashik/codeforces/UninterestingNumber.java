package ashik.codeforces;

import java.util.Scanner;

public class UninterestingNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		input.nextLine();
		while (t-- > 0) {

			String num = input.next();
			int size = num.length();
			int two = 0;
			long sum = 0;
			long extraSum = 0;

			for (int i = 0; i < size; i++) {

				sum += num.charAt(i) - '0';
				if (num.charAt(i) == '2') {
					two++;
					extraSum += 2L;
				} else if (num.charAt(i) == '3') {
					extraSum += 6L;
				}
			}

			if (sum % 9 == 0) {
				System.out.println("Yes");
			} else {

				long rem = 0;

				if (sum % 2 == 0) {
					if (sum < 9) {
						rem = 9 - sum;
						rem += 9;
					} else {
						rem = sum % 9;
						rem = 9 - rem;
						if ((sum + rem) % 2 != 0) {
							rem += 9;
						}
					}
				} else {
					if (sum < 9) {
						rem = 9 - sum;
					} else {
						rem = sum % 9;
						rem = 9 - rem;

						if ((sum + rem) % 2 != 1) {
							rem += 9;
						}
					}
				}

				if (rem > extraSum) {
					System.out.println("No");
				} else {
					if (two > 1) {
						System.out.println("Yes");
					}else if(two > 0) {
						if (rem == 4 || rem % 6 == 4) {
							System.out.println("No");
						} else {
							System.out.println("Yes");
						}
					}else {
						
						if(rem % 6 == 0) {
							System.out.println("Yes");
						}else {
							System.out.println("No");
						}
					}
				}
			}
		}
		input.close();
	}

}
