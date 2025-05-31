package ashik.codeforces;

import java.util.Scanner;

public class TungTungSahur {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		input.nextLine();
		while (t-- > 0) {

			String p = input.next();
			String s = input.next();

			int n = p.length();
			int m = s.length();
			boolean track = false;
			for (int i = 0, j = 0; i < n;) {

				int pCount = 0;
				int sCount = 0;
				char c = p.charAt(i);
				while (i < n && c == p.charAt(i)) {
					pCount++;
					i++;
				}

				while (j < m && s.charAt(j) == c) {
					sCount++;
					j++;
				}

				if (sCount < pCount || sCount > pCount*2) {
					System.out.println("NO");
					track = true;
					break;
				}
				
				if(i == n && j<m) {
					System.out.println("NO");
					track = true;
				}
			}
			if(track == false) {
				System.out.println("YES");
			}
		}
		
		
		input.close();
	}

}
