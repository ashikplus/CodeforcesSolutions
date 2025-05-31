package ashik.codeforces;

import java.util.Scanner;

public class RakhshsRevival {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
        	int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            
            String str = input.next();
            int size = str.length();
            int count = 0;
            
            for(int i=0; i<size; i++) {
            	int zero = 0;
            	
            	while(i<size && str.charAt(i) == '0') {
            		zero++;
            		if(zero == m) {
            			i+=(k-1);
            			count++;
            			zero = 0;
            		}
            		i++;
            	}
            }
            System.out.println(count);
        }
        input.close();
	}

}
