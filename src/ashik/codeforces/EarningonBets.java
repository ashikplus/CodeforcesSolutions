package ashik.codeforces;

import java.util.Scanner;

public class EarningonBets {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();

            long[] k = new long[n];

            for (int i = 0; i < n; i++) {
                k[i] = input.nextLong();
            }

            long result = lcmOfArray(k);

            long investedMoney = 0;
            for (int i = 0; i < n; i++) {
                long a = result / k[i];
                investedMoney += a;
            }

            long x = result / k[0];
            long winMoney = x * k[0];

            if (winMoney <= investedMoney) {
                System.out.print(-1);
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print((result / k[i]) + " ");
                }
            }
            System.out.println();
        }

        input.close();
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public static long lcmOfArray(long[] k) {
        long result = k[0];
        for (int i = 1; i < k.length; i++) {
            result = lcm(result, k[i]);
        }
        return result;
    }
}
