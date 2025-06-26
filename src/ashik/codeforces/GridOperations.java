package ashik.codeforces;
import java.util.Scanner;

public class GridOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();

            System.out.println(2 * n - 1);

            for (int i = 1; i < n; i++) {
                System.out.println(i + " " + 1 + " " + i);
                System.out.println(i + " " + (i + 1) + " " + n);
            }

            System.out.println(n + " " + 1 + " " + n);
        }

        sc.close();
    }
}
