package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class TwoLargeBags {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int[] a = new int[n];
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }
            
            Arrays.sort(a);
            
            int count=0;
            int position = 0;
            
            for(int i=0; i<n; ) {
            	
            	int x = a[i];
            	while(i<n && a[i] == x) {
            		count++;
            		i++;
            		position++;
            	}
            	if(count == 1) {
            		System.out.println("No");
            		break;
            	}else if((count & 1) == 1) {
            		int diff = a[position] - a[position-1];
            		if((diff*2) > count) {
            			System.out.println("No");
            			break;
            		}else {
            			count = count-(diff*2);
            		}
            		
            	}else {
            		
            		if(position == n) {
            			System.out.println("Yes");
            			break;
            		}
            		
            		int diff = a[position] - a[position-1];
            		
            		if((diff*2) > count) {
            			count = 0;
            		}else {
            			count = count-(diff*2);
            		}
            	}
            	
            }
        }
        input.close();
	}

}
