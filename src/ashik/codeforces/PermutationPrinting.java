package ashik.codeforces;

import java.util.Scanner;

public class PermutationPrinting {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            boolean on = true;
            int k = n;
            for(int i=1,j=1; i<=n; i++) {
            	
            	if(on) {
            		System.out.print(j+" ");
            		j++;
            		on = false;
            	}else {
            		System.out.print(k--+" ");
            		on = true;
            	}
            }
            System.out.println();
        }
        input.close();
	}

}
