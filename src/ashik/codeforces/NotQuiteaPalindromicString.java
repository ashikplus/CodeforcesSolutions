package ashik.codeforces;

import java.util.Scanner;

public class NotQuiteaPalindromicString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            input.nextLine();

            String s = input.next();
            int one = 0;
            int zero = 0;
            
            int j = n-1;
            for(int i=0; i<n; i++) {

            	if(s.charAt(i) == '1') {
            		one++;
            	}else {
            		zero++;
            	}
            }
            
            int maxValidPairs = 0;
            int minValidPairs = 0;
            if(one % 2==1 || zero % 2==1) {
            	maxValidPairs = n/2;
            	maxValidPairs--;
            }else {
            	maxValidPairs = n/2;
            }
            
            int min = Math.min(one, zero);
            
            minValidPairs = (n - (min*2))/2;
            
            if(k<minValidPairs || k>maxValidPairs) {
            	System.out.println("No");
            }else {
            	
            	if((k%2==1 &&  minValidPairs %2==0) || (minValidPairs %2==1 && k%2==0)) {
            		System.out.println("No");
            	}else {
            		System.out.println("Yes");
            	}
            	
            }
            
        }
        input.close();
	}

}
