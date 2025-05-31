package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MaximizeMex {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : a) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
            
            int mex = 0;
            while (freq.getOrDefault(mex, 0) > 0) {
                freq.put(mex + x, freq.getOrDefault(mex + x, 0) + freq.get(mex) - 1);
                mex++;
            }
            
            System.out.println(mex);
        }
        scanner.close();
	}

}
