package ashik.codeforces;

import java.util.Scanner;

public class InsaneProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();

        while (tt-- > 0) {
            long k = sc.nextLong();
            long l1 = sc.nextLong();
            long r1 = sc.nextLong();
            long l2 = sc.nextLong();
            long r2 = sc.nextLong();

            long kn = 1;
            long ans = 0;

            while (r2 / kn >= l1) {
                long left = Math.max((l2 - 1) / kn + 1, l1);
                long right = Math.min(r2 / kn, r1);

                if (right >= left) {
                    ans += (right - left + 1);
                }

                // Prevent overflow
                if (kn > Long.MAX_VALUE / k) break;
                kn *= k;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

