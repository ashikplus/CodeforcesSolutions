package ashik.codeforces;

import java.util.Scanner;

public class HavingBeenATreasurerInThePastIHelpGoblinsDeceive {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            String s = input.next();
            
            int colon = 0;
            int hiphen = 0;
            
            for(int i=0; i<n; i++) {
            	if(s.charAt(i) == '-') {
            		colon++;
            	}else if(s.charAt(i) == '_') {
            		hiphen++;
            	}
            }
            
            int normalInt = colon/2;
            double ceilInt = Math.ceil((double) colon/2);
            
            long ans =  (long) (ceilInt * normalInt);
            
            ans = ans * hiphen;
            
            System.out.println(ans);
        }
        input.close();
	}

}
