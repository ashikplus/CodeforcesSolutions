package ashik.codeforces;

import java.util.Scanner;

public class Shashliks {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		while (t-- > 0) {
			int k = input.nextInt();
			int a = input.nextInt();
			int b = input.nextInt();
			int x = input.nextInt();
			int y = input.nextInt();

			int maxPortions = 0;
			int maxPortionsTwo = 0;

			int m = k - a;

			if (m < 0) {
				maxPortions += 0;
			} else {
				int n = m / x;
				n++;
				maxPortions += n;

				int o = k - (n*x);

				if (o < b) {
					maxPortions += 0;
				} else {
					
					int p = o-b;
					int q = p/y;
					q++;
					maxPortions += q;
				}
			}
			
			int e = k-b;
			if(e<0) {
				maxPortionsTwo+=0;
			}else {
				int f = e/y;
				f++;
				maxPortionsTwo += f;
				
				int g = k - (f*y);
				
				if(g<a) {
					maxPortionsTwo+=0;
				}else {
					
					int h = g-a;
					int i = h/x;
					i++;
					maxPortionsTwo += i;
				}
			}

			System.out.println(Math.max(maxPortions, maxPortionsTwo));
		}
		input.close();
	}

}
