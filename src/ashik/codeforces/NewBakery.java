package ashik.codeforces;

import java.util.Scanner;

public class NewBakery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();
 
            if (b <= a) {
                System.out.println((long) n * a); 
            } else if (b - a == 1) {
                long res = (long) b + ((long) (n - (b - a)) * a);
                System.out.println(res);
            } else if (b - a < n) {
            	int ba = b - a;
            	long term1 = ((long) b * (b + 1)) / 2;
            	long term2 = ((long) (b - ba) * (b - ba + 1)) / 2;
            	long term3 = ((long) (n - ba)) * a;
 
            	long res = term1 - term2 + term3;
            	System.out.println(res);
 
            } else {
                long x = (long) b * (b + 1) / 2;
                long y = (long) (b - n) * (b - n + 1) / 2;
 
                long res = x - y;
                System.out.println(res);
            }
        }
        input.close();
    }
}