package ashik.codeforces;

import java.util.Scanner;

public class ArrayCraft {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            boolean on1 = true;
            boolean on2 = true;
            
            int[] a = new int[n+1];
            
            for(int i=y-1; i>=1; i--) {
            	if(on1) {
        			a[i] = -1;
        			on1 = false;
        		}else {
        			a[i] = 1;
        			on1 = true;
        		}
            }
            
            for(int i=x+1; i<=n; i++) {
            	if(on2) {
            		a[i] = -1;
        			on2 = false;
        		}else {
        			a[i] = 1;
        			on2 = true;
        		}
            }
            
            for(int i=y; i<=x; i++) {
            	a[i] = 1;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int i=1; i<=n; i++) {
            	sb.append(a[i]+" ");
            }
            System.out.println(sb.toString());
        }
        input.close();
	}

}
