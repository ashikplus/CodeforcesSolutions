package ashik.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChooseTheDifferentOnes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            
            int[] a = new int[n];
            int[] b = new int[m];
            
            Set<Integer> set = new HashSet<Integer>();
            Set<Integer> set1 = new HashSet<Integer>();
            
            for(int i=0; i<n; i++) {
            	int ai = input.nextInt();
            	if(ai <= k && set.size() != k ) {
            		
            		set.add(ai);
            	}
            }
            
            for(int i=0; i<m; i++) {
            	int bi = input.nextInt();
            	if(bi <= k && set1.size() != k) {
            		
            		set1.add(bi);
            	}
            }
            
            if(set.size() < k/2 || set1.size() < k/2) {
            	System.out.println("No");
            	continue;
            }
            
            Set<Integer> intersection = new HashSet<>(set);

            intersection.retainAll(set1);

            int commonCount = intersection.size();
            
            int setDistinctCount = set.size() - commonCount;
            int set1DistinctCount = set1.size() - commonCount;
            
            if(commonCount + setDistinctCount + set1DistinctCount < k) {
            	System.out.println("No");
            }else if(setDistinctCount > k/2 || set1DistinctCount > k/2) {
            	System.out.println("No");
            }else {
            	System.out.println("yes");
            }
            
        }
        input.close();
	}

}
