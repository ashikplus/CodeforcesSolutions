package ashik.codeforces;

import java.util.Scanner;

public class LongestGoodArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			
		        b-=a;
		        
		        long l=2,r=1000000000;
		        
		        while(l<r)
		        {
		            long m=(l+r)/2;
		            if(m*(m-1)/2<=b)
		            {
		                l=m+1;
		            }
		            else
		            {
		                r=m;
		            }
		        }
		        System.out.println(l-1);
		}
		input.close();
		
	}

}
