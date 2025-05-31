package ashik.codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class ExpensiveNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            BigInteger n = input.nextBigInteger();
            
            String number = n.toString();
            
            int length = number.length();
            boolean track = false;
            int count=0;
            
            for(int i=length-1; i>=0; i--) {
            	
            	if(track == false && number.charAt(i) == '0') {
            		count++;
            	}else {
            		if(number.charAt(i) != '0') {
            			count++;
            		}
            		track = true;
            	}
            }
            System.out.println(--count);
        }
        input.close();
	}

}
