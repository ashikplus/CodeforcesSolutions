package ashik.codeforces;

import java.util.Scanner;

public class CutRibbon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        final int NEG = -1_000_000;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; ++i) dp[i] = NEG;
        dp[0] = 0;

        for (int i = 1; i <= n; ++i) {
            if (i >= a && dp[i - a] != NEG) dp[i] = Math.max(dp[i], dp[i - a] + 1);
            if (i >= b && dp[i - b] != NEG) dp[i] = Math.max(dp[i], dp[i - b] + 1);
            if (i >= c && dp[i - c] != NEG) dp[i] = Math.max(dp[i], dp[i - c] + 1);
        }

        System.out.println(dp[n]);
	}

}
