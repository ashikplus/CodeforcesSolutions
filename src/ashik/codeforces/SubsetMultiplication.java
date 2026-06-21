package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubsetMultiplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int[] b = new int[n];
            
            for(int i=0; i<n; i++) {
            	b[i] = input.nextInt();
            }
            
            Map<Integer, Integer> problemMap = new HashMap<Integer, Integer>();
            
            
            for(int i=0; i<n-1; i++) {
            	
            }
            
        }
        input.close();
	}

}
