package ashik.codeforces;

import java.util.Scanner;

public class Tprimes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {

			long x = input.nextLong();
			
			boolean perfectSquare = isPerfectSquare(x);
			
			if(perfectSquare) {
				int root = (int) Math.sqrt(x);
				boolean prime = isPrime(root);
				if(prime) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				System.out.println("NO");
			}
			
		}
		input.close();
	}
	
	public static boolean isPerfectSquare(long x) {
        if (x < 0) return false; 
        long root =  (long) Math.sqrt(x);
        return root * root == x;
    }
	
	public static boolean isPrime(long x) {
        if (x < 2) return false;
        if (x == 2 || x == 3) return true;
        if (x % 2 == 0 || x % 3 == 0) return false;

        for (int i = 5; i * i <= x; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
