package ashik.codeforces;
import java.util.*;

public class ShohagLovesXOREasy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); 

        while (t-- > 0) {
            int x = input.nextInt();
            long m = input.nextLong();

            long count = 0;

            for (int z = 1; z <= 2 * x; z++) {
                long y = x ^ z;
                if (y == x || y < 1 || y > m) continue;

                if (x % z == 0 || y % z == 0) {
                    count++;
                }
            }

            System.out.println(count);
        }

        input.close();
    }
}
