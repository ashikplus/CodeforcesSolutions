package ashik.codeforces;

import java.util.Scanner;

public class KevinandBinaryStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		input.nextLine();
		while (t-- > 0) {
			String binary = input.next();
			int size = binary.length();
			boolean on = false;
			int zero = 0;
			int one = 0;

			for (int i = 0; i < size; i++) {

				if (binary.charAt(i) == '0') {
					if(!on) {
						one = i;
					}
					zero++;
					on = true;
				}else {
					if(on) {
						break;
					}
				}
			}
			if (on == false) {
				System.out.println(1 + " " + size + " " + size + " " + size);
			}else {
				if(zero >= one) {
					System.out.println(1 + " " + size + " " + 1 + " " + (size-one));
				}else {
					int diff = one - zero;
					int a = size-one;
					System.out.println(1 + " " + size + " " + (diff+1) + " " + (diff+a));
				}
			}
		}
		input.close();
	}

}
