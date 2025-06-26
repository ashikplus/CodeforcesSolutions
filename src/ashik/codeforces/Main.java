package ashik.codeforces;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }

            Map<Long, Integer> map = new HashMap<>();
            long sum = 0;
            map.put(0L, 1); 

            boolean found = false;

            for (int i = 0; i < n; ++i) {
                a[i] = (i % 2 == 0) ? a[i] : -a[i]; 
                sum += a[i];

                if (map.containsKey(sum)) {
                    found = true;
                    break;
                }

                map.put(sum, 1);
            }

            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}
