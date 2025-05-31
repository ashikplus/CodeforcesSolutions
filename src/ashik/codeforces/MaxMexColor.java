package ashik.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMexColor {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
        	int n = input.nextInt();
            int x = input.nextInt();

            List<Integer> p = new ArrayList<Integer>();
            
            for (int i = 0; i < x; i++) {
                p.add(i);
            }

            for (int i = x + 1; i < n; i++) {
                p.add(i);
            }

            if (x < n) {
                p.add(x);
            }

            for (int num : p) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}
