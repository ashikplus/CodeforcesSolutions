package ashik.codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class GCDLCMProcessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(input.nextLine());
            long[] a = Arrays.stream(input.nextLine().split(" "))
                             .mapToLong(Long::parseLong)
                             .toArray();

            long gcd = 0;
            long lcm = 1;

            for (int i = n - 1; i >= 0; i--) {
                gcd = gcd(gcd, a[i]);
                long reduced = a[i] / gcd;
                lcm = lcm(lcm, reduced);
            }

            System.out.println(lcm);
        }

        input.close();
    }

    // GCD using Euclidean algorithm
    public static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    // LCM using (a * b) / GCD
    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return (a / gcd(a, b)) * b;
    }
}
