package ashik.codeforces;

import java.util.Scanner;

public class ViciousLabyrinth {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            
            if (k % 2 == 0) {
                for (int i = 0; i < n - 2; i++) {
                    System.out.print((n - 1) + " ");
                }
                System.out.print(n + " ");
                System.out.println(n - 1);
            } else {
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(n + " ");
                }
                System.out.println(n - 1);
            }
            System.out.println();
        }
        input.close();
	}

}