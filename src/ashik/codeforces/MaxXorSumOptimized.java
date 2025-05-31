package ashik.codeforces;

import java.util.Scanner;

public class MaxXorSumOptimized {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {

			int[] countOn = new int[32];
			int[] countOff = new int[32];
			
			int n = input.nextInt();
			int[] a = new int[n];
			
			for(int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			for (int num : a) {
				for (int b = 0; b < 32; b++) {
					if ((num & (1 << b)) != 0) {
						countOn[b]++;
					} else {
						countOff[b]++;
					}
				}
			}

			long maxScore = Long.MIN_VALUE;
			int bestX = -1;

			for (int x : a) {
				long score = 0;
				for (int b = 0; b < 32; b++) {
					long power = 1L << b;
					if ((x & (1 << b)) != 0) {
						score += countOff[b] * power;
					} else {
						score += countOn[b] * power;
					}
				}

				if (score > maxScore) {
					maxScore = score;
					bestX = x;
				}
			}

			System.out.println(maxScore);
		}
		input.close();
	}
}
