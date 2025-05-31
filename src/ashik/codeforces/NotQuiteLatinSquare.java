package ashik.codeforces;

import java.util.Scanner;

public class NotQuiteLatinSquare {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            
            String str1 = input.next();
            String str2 = input.next();
            String str3 = input.next();
            
            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();
            char[] char3 = str3.toCharArray();
            
            
            int a = char1[0] + char1[1] + char1[2];
            int b = char2[0] + char2[1] + char2[2];
            int c = char3[0] + char3[1] + char3[2];
            
            int d = a+b+c;
            
            if(d == 592) {
            	System.out.println("A");
            }else if(d == 591) {
            	System.out.println("B");
            }else if(d == 590){
            	System.out.println("C");
            }
            
        }
        input.close();
	}

}
