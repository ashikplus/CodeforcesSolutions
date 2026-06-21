package ashik.codeforces;

import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {

			int n = input.nextInt();
			int x = input.nextInt();
			int m = input.nextInt();

			int left = x;
			int right = x;

			for (int i = 0; i < m; i++) {
				
				int l = input.nextInt();
				int r = input.nextInt();
				
				if(l<left && r>right) {
					left=l;
					right=r;
				}else if(l<left && r>=left) {
					left=l;
				}else if(r>right && l<=right) {
					right=r;
				}
			}
			System.out.println((right-left)+1);
		}

		input.close();
	}

}
