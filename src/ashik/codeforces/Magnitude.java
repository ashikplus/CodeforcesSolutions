package ashik.codeforces;

import java.util.*;

public class Magnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0, minPrefix = 0;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                sum += val;
                minPrefix = Math.min(minPrefix, sum);
            }

            System.out.println(sum - 2 * minPrefix);
        }

        sc.close();
    }
}

