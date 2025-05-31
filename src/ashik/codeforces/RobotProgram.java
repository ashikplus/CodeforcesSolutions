package ashik.codeforces;

import java.util.Scanner;

public class RobotProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int x = input.nextInt();
			long k = input.nextLong();
			input.nextLine();
			String s = input.next();
			long c = 0;
			int c1 = 0;
			int zeroTrack = 0;
			int[] trackZeroOne = new int[2];
			long l = k;

			outer: for (int i = 0; i < n && l > 0; i++) {
				c1++;
				l--;
				if (s.charAt(i) == 'L') {
					x--;
					if (x == 0) {
						trackZeroOne[zeroTrack] = c1;
						c1=0;
						zeroTrack++;
						if (i == n - 1 && l == 0) {
							break outer;
						}else if(zeroTrack == 2) {
							break outer;
						}
						i = -1;
					}
				} else {
					x++;
					if (x == 0) {
						trackZeroOne[zeroTrack] = c1;
						c1=0;
						zeroTrack++;
						if (i == n - 1 && l == 0) {
							break outer;
						}else if(zeroTrack == 2) {
							break outer;
						}
						i = -1;
					}
				}
			}

			if (zeroTrack < 2) {
				System.out.println(zeroTrack);
			} else {

				int sum = trackZeroOne[1] + trackZeroOne[0];
				long res = k-sum;
				long ans = (long) res / trackZeroOne[1];
//				c = ans * 2;
//				long ans1 = (long) k % sum;
//				if (ans1 >= trackZeroOne[0]) {
//					c += 2;
//				}
				System.out.println(ans+2);
			}

		}
		input.close();
	}

}
