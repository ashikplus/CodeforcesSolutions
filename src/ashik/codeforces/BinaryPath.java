package ashik.codeforces;

import java.util.Scanner;

public class BinaryPath {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            input.nextLine();
            String s = input.next();
            String s1 = input.next();
            int size = s.length();
            int count=1;
            int l=0;
            
            
            for(int i=0; i<size-1; i++) {
            	
            	if(s.charAt(i+1) == s1.charAt(i)) {
            		count++;
            	}else if(s.charAt(i+1) == '0' && s1.charAt(i) == '1') {
            		count = 1;
            		l=i+1;
            	}else {
            		break;
            	}
            }
            
            String fs = s.substring(0, l+1) + s1.substring(l);
            System.out.println(fs);
            System.out.println(count);
        }
        input.close();
	}

}
