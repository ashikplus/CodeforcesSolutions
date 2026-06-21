package ashik.codeforces;

import java.util.Scanner;

public class TroubleSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int[] a = new int[n];
            int[] b = new int[n];
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            for(int i=0; i<n; i++) {
            	b[i] = input.nextInt();
            }
            
            boolean sortedA = isSortedA(a);
            
            boolean bSwapable = isBSwapable(b);
            
            if(sortedA) {
            	System.out.println("Yes");
            }else if(bSwapable) {
            	System.out.println("Yes");
            }else {
            	System.out.println("No");
            }
            
            
        }
        input.close();;
	}

	private static boolean isBSwapable(int[] b) {
		
		boolean zero = false;
		boolean one = false;
		
		for(int i=0; i<b.length; i++) {
			if(b[i] == 0) {
				zero = true;
			}else {
				one = true;
			}
			if(zero && one) {
				return true;
			}
		}
		return false;
		
	}

	private static boolean isSortedA(int[] a) {

		for(int i=0; i<a.length; i++) {
			if(i+1 < a.length && a[i] > a[i+1]) {
				return false;
			}
		}
		return true;
	}

}
