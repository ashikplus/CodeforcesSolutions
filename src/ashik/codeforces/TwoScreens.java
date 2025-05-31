package ashik.codeforces;

import java.util.Scanner;

public class TwoScreens {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int q = input.nextInt();
		input.nextLine();

		while (q-- > 0) {
			
			String s = input.nextLine();
			String t = input.nextLine();
			int sLength = s.length();
			int tLength = t.length();
			
			int l = 0;
			int minLength = Math.min(sLength, tLength);
			
			while(l < minLength && s.charAt(l) == t.charAt(l)) {
				
				l++;
			}
			
			if(l==0) {
				System.out.println(sLength + tLength);
			}else {
				System.out.println((sLength + tLength) - 2*l + l + 1);
			}
		}
		input.close();
	}

}
