package ashik.codeforces;
import java.util.Scanner;

public class BlackCircles {

    static int t, n;
    static int[] x = new int[100011];
    static int[] y = new int[100011];

    static long dis(int x1, int y1, int x2, int y2) {
        long dx = x2 - x1;
        long dy = y2 - y1;
        return dx * dx + dy * dy;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        t = input.nextInt();

        while (t-- > 0) {
            n = input.nextInt();

            for (int i = 1; i <= n; ++i) {
                x[i] = input.nextInt();
                y[i] = input.nextInt();
            }

            int xs = input.nextInt();
            int ys = input.nextInt();
            int xt = input.nextInt();
            int yt = input.nextInt();

            boolean ok = true;

            long travelDist = dis(xs, ys, xt, yt);

            for (int i = 1; i <= n; ++i) {
                if (dis(xt, yt, x[i], y[i]) <= travelDist) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }

        input.close();
    }
}
