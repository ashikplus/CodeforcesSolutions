package ashik.codeforces;

import java.util.Scanner;

public class SquareYear {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        input.nextLine();
        
        while (t-- > 0) {
            String s = input.next();
            
            int value = Integer.parseInt(s);

            int sqrt = (int) Math.sqrt(value);
            
            if((sqrt * sqrt) == value) {
            	
            	int x = sqrt/2;
            	
            	int y = sqrt-x;
            	
            	System.out.println(x+" "+y);
            }else {
            	System.out.println(-1);
            }
        }
        input.close();
	}

}
