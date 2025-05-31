package ashik.codeforces;

import java.util.Scanner;

public class MINGCD {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            long[] a = new long[n];
            
            long min = Long.MAX_VALUE;
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            	
            	if(a[i] < min) {
            		min =a[i];
            	}
            }
            
            int minCount = 0;
            int vCount = 0;
            long[] twoGcd = new long[2];
            long min2 = Long.MAX_VALUE;
            long rem = 0;
            
            for(int i=0; i<n; i++) {
            	
            	if(a[i] == min) {
            		minCount++;
            		if(minCount > 1) {
            			System.out.println("Yes");
            			break;
            		}
            	}else if(a[i] % min == 0) {
            		
            		if(vCount < 2) {
            			twoGcd[vCount] = a[i];
            			if(vCount == 1) {
            				rem = gcd(twoGcd[0], twoGcd[1]);
            				if(rem == min) {
            					System.out.println("Yes");
            					break;
            				}
            				min2 = Math.min(twoGcd[0], twoGcd[1]);
            			}
            			
            			vCount++;
            			
            		}else if(vCount >= 2) {
            			
            			if(a[i] < rem) {
            				if(rem % a[i] != 0) {
            					System.out.println("Yes");
            				}
            			}
            		}
            	}
            	
            	
            }
        }
        input.close();
	}
	
	static long gcd(long a, long b) {
	    if (a < b) return gcd(b, a);  // Swap if a < b
	    return b == 0 ? a : gcd(b, a % b);
	}

}
