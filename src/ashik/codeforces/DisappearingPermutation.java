package ashik.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DisappearingPermutation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int[] p = new int[n+1];
            Set<Integer> set = new HashSet<Integer>();
            
            for(int i=1; i<=n; i++) {
            	p[i] = input.nextInt();
            }
            
            for(int i=0; i<n; i++) {
            	int d = input.nextInt();
            	
            	while(!set.contains(p[d])) {
            		set.add(p[d]);
            		d = p[d];
            	}
            	
            	System.out.print(set.size()+" ");
            }
            System.out.println();
        }
        input.close();;
	}

}
