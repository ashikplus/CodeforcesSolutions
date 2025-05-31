package ashik.codeforces;

import java.util.Scanner;

public class SimpleRepetition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            Long x = input.nextLong();
            int k = input.nextInt();
            
            if(x == 1 && k==2) {
            	System.out.println("Yes");
            	continue;
            }
            
            boolean isPrime = isPrime(x);
            
            if(isPrime && k>1) {
            	System.out.println("No");
            }else if(isPrime && k==1) {
            	System.out.println("Yes");
            }else {
            	System.out.println("No");
            }
        }
        input.close();
	}
	
	public static boolean isPrime(long n){
	    if(n<2) {
	    	return false;
	    }
	    for(long i=2;i*i<=n;i++){
	        if(n%i==0) {
	        	return false;
	        }
	    }
	    return true;
	}

}
