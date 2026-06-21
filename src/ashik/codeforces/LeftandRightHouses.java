package ashik.codeforces;

import java.util.Scanner;

public class LeftandRightHouses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
		sc.nextLine(); 

		while (t-- > 0) {
			int n = Integer.parseInt(sc.nextLine());
			String a = sc.nextLine();

			int[] suf_cnt = new int[n + 1];

			// Compute suffix count of '1's
			for (int i = n - 1; i >= 0; i--) {
				suf_cnt[i] = suf_cnt[i + 1] + (a.charAt(i) == '1' ? 1 : 0);
			}

			int pref_cnt = 0;
			int opt_ans = -1;
			int opt_dist = n * 2;

			for (int i = 0; i <= n; i++) {
				boolean prefixGood = pref_cnt >= (i + 1) / 2;
				boolean suffixGood = suf_cnt[i] >= (n - i + 1) / 2;
				int distance = Math.abs(n - 2 * i);

				if (prefixGood && suffixGood && distance < opt_dist) {
					opt_dist = distance;
					opt_ans = i;
				}

				if (i != n && a.charAt(i) == '0') {
					pref_cnt++;
				}
			}

			System.out.println(opt_ans);
		}
	}
}
