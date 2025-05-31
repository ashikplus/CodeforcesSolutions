package ashik.codeforces;

import java.util.Scanner;

public class Journey {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {

			int n = input.nextInt();

			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();

			int sum = a + b + c;

			int div = n / sum;
			
			int rem = n%sum;
			
			if(rem > (a+b)) {
				System.out.println(3*div+3);
			}else if(rem > a) {
				System.out.println(3*div+2);
			}else if(rem > 0) {
				System.out.println(3*div+1);
			}else {
				System.out.println(3*div);
			}

		}
		input.close();
	}

}
