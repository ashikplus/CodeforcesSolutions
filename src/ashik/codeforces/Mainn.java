package ashik.codeforces;
import java.util.*;

public class Mainn {

    static void solve(Scanner sc) {
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            int best = sb.charAt(i) - '0';
            int pos = i;

            for (int j = i; j < Math.min(i + 10, sb.length()); j++) {
                int val = (sb.charAt(j) - '0') - (j - i);
                if (val > best) {
                    best = val;
                    pos = j;
                }
            }

            while (pos > i) {
                char tmp = sb.charAt(pos);
                sb.setCharAt(pos, sb.charAt(pos - 1));
                sb.setCharAt(pos - 1, tmp);
                pos--;
            }

            sb.setCharAt(i, (char) (best + '0'));
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TESTS = sc.nextInt();
        while (TESTS-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
