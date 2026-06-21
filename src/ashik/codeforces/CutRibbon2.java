package ashik.codeforces;

import java.util.Scanner;

public class CutRibbon2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				int k = n - (a * i + b * j);
				if (k >= 0 && k % c == 0)
					ans = Math.max(ans, i + j + k / c);
			}
		}
		System.out.println(ans);
		sc.close();

	}
	
}
