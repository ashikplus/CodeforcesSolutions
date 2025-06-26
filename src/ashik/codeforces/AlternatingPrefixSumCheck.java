package ashik.codeforces;
import java.util.*;

public class AlternatingPrefixSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }

            Map<Long, Integer> prefixSumMap = new HashMap<>();
            long sum = 0;
            prefixSumMap.put(0L, 1);
            boolean found = false;

            for (int i = 0; i < n; ++i) {
                int value = (i % 2 == 0) ? a[i] : -a[i];
                sum += value;

                if (prefixSumMap.containsKey(sum)) {
                    System.out.println("YES");
                    found = true;
                    break;
                }

                prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
            }

            if (!found) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
