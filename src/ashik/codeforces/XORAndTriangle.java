package ashik.codeforces;
import java.util.Scanner;

public class XORAndTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();  // Number of test cases

        while (t-- > 0) {
            int x = input.nextInt();
            int ans = -1;

            // Iterate over bit positions
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 30; j++) {
                    int y = (1 << i) | (1 << j); // Construct y with two set bits

                    if (y < x && x + y > (x ^ y) && y + (x ^ y) > x) {
                        ans = y;
                    }
                }
            }
            System.out.println(ans);
        }

        input.close();
    }
}
