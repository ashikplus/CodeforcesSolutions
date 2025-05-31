package ashik.codeforces;
import java.util.*;

public class CountingPairsOptimized {

    public static long calcLessThanX(int[] a, long x) {
        int n = a.length;
        long s = 0;
        for (int num : a) {
            s += num;
        }

        int j = 0;
        long ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            while (j < n && s - (a[i] + a[j]) >= x) {
                j++;
            }
            ans += (n - j);
        }

        for (int i = 0; i < n; i++) {
            if (s - a[i] - a[i] < x) {
                ans--;
            }
        }

        return ans / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            long x = input.nextLong();
            long y = input.nextLong();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }

            Arrays.sort(a);
            long result = calcLessThanX(a, y + 1) - calcLessThanX(a, x);
            System.out.println(result);
        }

        input.close();
    }
}
