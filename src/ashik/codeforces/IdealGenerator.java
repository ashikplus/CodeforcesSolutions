package ashik.codeforces;

import java.util.Scanner;

public class IdealGenerator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			
			int k = input.nextInt();
			if(k%2 == 0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
			
		}
		input.close();
	}

}
