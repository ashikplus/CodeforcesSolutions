package ashik.codeforces;

import java.util.Scanner;

public class pspspsps {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			input.nextLine();
			String s = input.nextLine();
			int pCount = 0;
			int sCount = 0;
			boolean psd = false;
			boolean spd = false;

			boolean x = false;
			int lastS = 0;
			int firstP = 0;
			boolean y = true;

			for (int i = 0; i < n; i++) {

				if (s.charAt(i) == 'p') {
					pCount++;
					x = true;
					if (y) {
						firstP = i;
						y = false;
					}

				} else if (s.charAt(i) == 's') {
					sCount++;
					if (x) {
						psd = true;
						break;
					}
					lastS = i;
				}
			}

			if (psd) {
				System.out.println("NO");
			} else if (pCount == 0 || sCount == 0) {
				System.out.println("YES");
			} else if (pCount > 1 && sCount > 1) {
				System.out.println("NO");
			} else {
				int max = Math.max(n - (lastS + 1), (firstP));
				
				if(max+1 < n) {
					System.out.println("NO");
				}else {
					System.out.println("YES");
				}
			}
		}
		input.close();
	}

}
