package ashik.codeforces;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServalAndFinalMEXOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            List<int[]> operations = new ArrayList<>();
            int mid = n / 2;
            int r = n;

            boolean hasZeroInSecondHalf = false;
            for (int i = mid; i < n; i++) {
                if (a[i] == 0) {
                    hasZeroInSecondHalf = true;
                    break;
                }
            }
            
            if (hasZeroInSecondHalf) {
                operations.add(new int[]{mid + 1, n});
                r -= (n - mid - 1);
            }

            boolean hasZeroInFirstHalf = false;
            for (int i = 0; i < mid; i++) {
                if (a[i] == 0) {
                    hasZeroInFirstHalf = true;
                    break;
                }
            }

            if (hasZeroInFirstHalf) {
                operations.add(new int[]{1, mid});
                r -= (mid - 1);
            }

            operations.add(new int[]{1, r});

            System.out.println(operations.size());
            for (int[] op : operations) {
                System.out.println(op[0] + " " + op[1]);
            }
        }
        scanner.close();
    }
}