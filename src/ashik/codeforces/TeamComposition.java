package ashik.codeforces;

import java.util.Scanner;

public class TeamComposition {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            long a = input.nextLong();
            long b = input.nextLong();
            long c,d;
            
            if(a*b == 0 || a+b < 4) {
            	System.out.println(0);
            }else if(a+b < 8) {
            	System.out.println(1);
            }else if( a == b ) {
            	long res = a/4;
            	long rem = a%4;
            	if(rem*2 > 3) {
            		System.out.println((res*2) + 1);
            	}else {
            		System.out.println(res*2);
            	}
            }else {
            	if(a>b) {
                	c=a;
                	d=b;
                }else {
                	c=b;
                	d=a;
                }
            	
            	long res = c/3;
            	long rem = c%3;
            	
            	if(d<=res) {
            		System.out.println(d);
            	}else {
            		long res2 = d-res;
            		long res3 = res2/4;
            		long rem1 = res2%4;
            		
            		long rem3 = (rem+rem1 > 3) ? 1 : 0;
            		
            		System.out.println((res+res3) + rem3);
            	}
            }
            
        }
        input.close();
	}

}
