package ashik.codeforces;

import java.util.Scanner;

public class OlympiadDate {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];
			boolean track = false;

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			int zero=0, one=0, two=0, three=0, five = 0;
			for(int i=0; i<n; i++) {
				
				if(a[i] == 0) {
					zero++;
				}else if(a[i] == 1) {
					one++;
				}else if(a[i] == 2) {
					two++;
				}else if(a[i] == 3) {
					three++;
				}else if(a[i] == 5) {
					five++;
				}
				
				if(i>=7) {
					
					if(zero >= 3 && one>=1 && two >= 2 && three >= 1 && five >= 1) {
						System.out.println(i+1);
						track = true;
						break;
					}
				}
			}
			if(track == false) {
				System.out.println(0);
			}
		}
		input.close();
	}

}
