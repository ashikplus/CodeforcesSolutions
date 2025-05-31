package ashik.codeforces;

import java.util.Scanner;

public class Legs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			
			int n = input.nextInt();
			
			int amount = n/4;
			
			if(n%4 == 0) {
				System.out.println(amount);
			}else {
				System.out.println(amount+1);
			}
		}
	}

}
