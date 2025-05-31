package ashik.codeforces;

import java.util.Scanner;

public class DrawASquare {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int l = input.nextInt();
            int r = input.nextInt();
            int d = input.nextInt();
            int u = input.nextInt();
            
            if(l > 0 && l == r && d == u && r == d) {
            	System.out.println("Yes");
            }else {
            	System.out.println("No");
            }
        }
        input.close();
	}

}
