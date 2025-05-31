package ashik.codeforces;

import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            
            int ans = 0;
            if (f(a, c) + f(b, d) > 0) ans += 1;
            if (f(a, d) + f(b, c) > 0) ans += 1;
            if (f(b, c) + f(a, d) > 0) ans += 1;
            if (f(b, d) + f(a, c) > 0) ans += 1;
            
            System.out.println(ans);
        }
        
        scanner.close();
    }
    
    public static int f(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }
}
