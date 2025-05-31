package ashik.codeforces;

import java.util.Scanner;

public class BobrittoBandito {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int l = input.nextInt();
            int r = input.nextInt();
            
            l = Math.abs(l);
            if(m > l && m > r) {
            	if(l<r) {
            		int diff = m-l;
            		System.out.println("-"+l+" "+diff);
            	}else {
            		int diff = m-r;
            		System.out.println("-"+diff+" "+r);
            	}
            }else if(m<=l && m<=r) {
            	int a = m/2;
            	int b = m-a;
            	System.out.println("-"+a+" "+b);
            }else {
            	if(l<r) {
            		int x = m-l;
            		if(l==0) {
            			System.out.println(l+" "+x);
            		}else {
            			System.out.println("-"+l+" "+x);
            		}
            	}else {
            		int y = m-r;
            		System.out.println("-"+y+" "+r);
            	}
            }
            
            
        }
        input.close();
	}

}
