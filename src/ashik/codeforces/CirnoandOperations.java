package ashik.codeforces;

import java.util.Scanner;

public class CirnoandOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while (t-- > 0) {
            int n = input.nextInt();
            long[] a = new long[n + 1]; 
            
            for (int i = 1; i <= n; i++) {
                a[i] = input.nextLong();
            }
            
            int now = n;
            long ans = Long.MIN_VALUE; 
            
            for (int i = 1; i <= n; i++) {
                long sum = 0;
                for (int j = 1; j <= now; j++) {
                    sum += a[j];
                }
                
                if (i == 1) {
                    ans = Math.max(ans, sum);
                } else {
                    ans = Math.max(ans, Math.max(sum, -sum));
                }
                
                for (int j = 1; j < now; j++) {
                    a[j] = a[j + 1] - a[j];
                }
                now--;
            }
            
            System.out.println(ans);
        }
        input.close();
    }
}