package ashik.codeforces;

import java.util.Scanner;

public class BowlingFrame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int w = input.nextInt();
			int b = input.nextInt();

			int sum = w+b;
			boolean track = false;
			if(sum == 0) {
				System.out.println(0);
				continue;
			}
			
			int j=0;
			for(int i=1; i<=sum;) {
				
				j++;
				if(i==sum) {
					System.out.println(j);
					track = true;
					break;
				}
				i += j+1;
			}
			if(!track) {
				System.out.println(j);
			}
		}
		input.close();
	}

}
