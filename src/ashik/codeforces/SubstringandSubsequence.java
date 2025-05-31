package ashik.codeforces;

import java.util.Scanner;

public class SubstringandSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            int n = a.length();
            int m = b.length();
            int ans = n + m;

            for (int i = 0; i < m; i++) {
                int j = i;
                for (char c : a.toCharArray()) {
                    if (j < m && c == b.charAt(j)) {
                        j++;
                    }
                }
                ans = Math.min(ans, n + m - (j - i));
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

