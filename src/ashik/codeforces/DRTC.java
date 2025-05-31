package ashik.codeforces;

import java.util.Scanner;

public class DRTC {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        input.nextLine();
        while (t-- > 0) {
            int n = input.nextInt();
            String s = input.next();
            
            int zero = 0;
            int one = 0;
            
            for(int i=0; i<n; i++) {
            	
            	if(s.charAt(i) == '0') {
            		zero++;
            	}else {
            		one++;
            	}
            }
            
            System.out.println(((one+1) * zero) + (one * (one-1)));
        }
        
        input.close();
	}

}
