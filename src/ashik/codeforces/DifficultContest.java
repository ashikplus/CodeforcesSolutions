package ashik.codeforces;

import java.util.Scanner;

public class DifficultContest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();

            long g = gcd(a, b);         
            long dx = a / g;            
            long dy = b / g;           

            if (dx <= k && dy <= k) {
                System.out.println(1);
            } else {
                System.out.println(2); 
            }
        }
        sc.close();
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
