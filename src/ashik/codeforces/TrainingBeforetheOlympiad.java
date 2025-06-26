package ashik.codeforces;

import java.util.Scanner;

public class TrainingBeforetheOlympiad {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            long sum = 0;
            
            int f = input.nextInt();
            sum+=f;
            
            System.out.print(f+" ");
            
            int odd = 0;
            if(f%2==1) {
            	odd++;
            }
            
            for(int i=1; i<n; i++) {
            	f = input.nextInt();
            	sum+=f;
            	if(f%2==1) {
            		odd++;
            	}
            	int res = odd/3;
            	int rem = odd%3;
            	
            	if(rem == 1) {
            		res++;
            	}
            	System.out.print((sum - res)+" ");
            }
            System.out.println();
        }
        input.close();
	}

}
