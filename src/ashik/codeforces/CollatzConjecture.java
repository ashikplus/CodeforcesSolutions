package ashik.codeforces;

import java.util.Scanner;

public class CollatzConjecture {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int k = input.nextInt();
            int x = input.nextInt();
            
            int ans = x;
            for(int i=0; i<k; i++) {
            	
            	ans = ans*2;
            }
            System.out.println(ans);
        }
        input.close();
	}

}
