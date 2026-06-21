package ashik.codeforces;

import java.util.Scanner;

public class PileShuffling {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            long[] c = new long[n];
            long[] d = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                b[i] = scanner.nextLong();
                c[i] = scanner.nextLong();
                d[i] = scanner.nextLong();
            }
            
            long operations = 0;
            long zeroImbalance = 0;
            long oneImbalance = 0;
            
            for (int i = 0; i < n; i++) {
                zeroImbalance += a[i] - c[i];
                oneImbalance += b[i] - d[i];
                operations += Math.abs(zeroImbalance) + Math.abs(oneImbalance);
            }
            
            System.out.println(operations / 2);
        }
        scanner.close();
	}

}
