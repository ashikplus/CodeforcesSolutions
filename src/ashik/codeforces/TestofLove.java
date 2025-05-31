package ashik.codeforces;

import java.util.Scanner;

public class TestofLove {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            input.nextLine();
            
            String a = input.next();
            int step = 0;
            int water = 0;
            boolean track = false;
            
            for(int i=0; i<n; i++) {
            	
            	if(a.charAt(i) == 'L') {
            		step = 0;
            	}else {
            		step++;
            		if(step >= m) {
            			
            			if(a.charAt(i) == 'C') {
            				System.out.println("No");
            				track = true;
            				break;
            			}else {
            				water++;
            				if(water > k) {
            					System.out.println("No");
            					track = true;
            					break;
            				}
            			}
            		}
            	}
            }
            
            if(!track) {
            	System.out.println("yes");
            }
        }
        input.close();
	}

}
