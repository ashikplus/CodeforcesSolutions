package ashik.codeforces;

import java.util.Scanner;

public class XORSequences {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int x = input.nextInt();
            int y = input.nextInt();
            int count = 0;
            
            for(int bit=0; bit<30; bit++) {

            	if((x >> bit & 1) == (y >> bit & 1)) {
            	    count++;
            	}else {
            		break;
            	}
            	
//            	if(((x ^ y) >> bit & 1) == 0) {
            	    // True if bits are equal
//            	}
            }
            System.out.println(1<<count);
        }
        input.close();
	}

}
