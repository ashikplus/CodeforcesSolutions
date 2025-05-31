package ashik.codeforces;

import java.util.Scanner;

public class ShiftsAndSorting {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        input.nextLine();
        while (t-- > 0) {
            String s = input.next();
            
            int size = s.length();
            
            long one = 0;
            boolean foundOne = false;
            long cost = 0;
            
            for(int i=0; i<size;) {
            	
            	while(foundOne == false &&   i<size && s.charAt(i) == '0') {
            		i++;
            		continue;
            	}
            	long zero = 0;
            	
            	while(i<size && s.charAt(i) == '1') {
            		one++;
            		foundOne = true;
            		i++;
            	}
            	
            	while(i<size && s.charAt(i) == '0') {
            		zero++;
            		i++;
            	}
            	
            	cost += ((one+1) * zero);
            	
            }
            System.out.println(cost);
            
        }
        input.close();
	}

}
