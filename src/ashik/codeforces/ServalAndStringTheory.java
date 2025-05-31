package ashik.codeforces;

import java.util.Scanner;

public class ServalAndStringTheory {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int k = input.nextInt();
            
            String str = input.next();
            
            if(n==1) {
            	System.out.println("No");
            	continue;
            }
            
            boolean allSame = str.chars().allMatch(c -> c == str.charAt(0));
            
            if(allSame) {
            	System.out.println("No");
            	continue;
            }
            
            String revstr = new StringBuilder(str).reverse().toString();
            
            if(str.compareTo(revstr) >= 0) {
            	if(k>0) {
            		System.out.println("Yes");
            	}else {
            		System.out.println("No");
            	}
            }else {
            	System.out.println("Yes");
            }
        }
        input.close();
	}

}
