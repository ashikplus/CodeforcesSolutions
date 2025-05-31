package ashik.codeforces;

import java.util.Scanner;

public class MakeEqualAgain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int[] a = new int[n];
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            int i=0;
            int left = 1;
            int right = 1;
            int j = n-1;
            
            while(i < n-1 && a[i] == a[i+1]) {
            	left++;
            	i++;
            }
            
            if(i+1 == n) {
            	System.out.println(0);
            	continue;
            }
            
            while(j>i+1 && a[j] == a[j-1]) {
            	right++;
            	j--;
            }
            
            int x = Math.max(left, right);
            int y = Math.min(left, right);
            if(a[0] == a[n-1]) {
            	int z = (left+right); // + (x-y);
            	System.out.println(n-z);
            }else {
//            	if(x==1) {
//            		System.out.println(n-1);
//            	}else {
            		System.out.println(n-x);
//            	}
            }
        }
        input.close();
	}

}
