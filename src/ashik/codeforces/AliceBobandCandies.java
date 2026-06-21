package ashik.codeforces;

import java.util.Scanner;

public class AliceBobandCandies {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			int f = 1;
			int l = n - 1;
			int move = 1;
			int aVal = a[0];
			int bVal = 0;
			int cur = a[0];
			n--;
			boolean on = false;

			int x = 0;
			int y = 0;

			int elem = 1;

			while (n > 0) {
				on = !on;
				if (on) {
					int comp = a[l];
					while (n > 0 && cur < comp) {
						l--;
						elem++;
						n--;
						comp+=a[l];
						bVal+=comp;
						if(n==0) {
							break;	
						}
						
					}
					if(elem == 1) {
						if(n==0) {
							break;	
						}
					}
				} else {

				}

			}

//			while (n > 0) {
//
//				if (on) {
//					x = a[l];
//					if(cur < x) {
//						bVal += a[l];
//						cur = x;
//						n--;
//						l--;
//						on = false;
//						move++;
//					}else {
//						x=0;
//						while (n > 0 && cur > x) {
//							bVal += a[l];
//							x += a[l];
//							l--;
//							n--;
//						}
//						move++;
//					}
//					
//					on = false;
//					cur = x;
//					if (n == 0) {
//						break;
//					}
//				} else {
//					y = a[f];
//					if(cur < y) {
//						aVal += a[f];
//						cur = y;
//						n--;
//						f++;
//						on = true;
//						move++;
//					}else {
//						y = 0;
//						while (n > 0 && cur > y) {
//							aVal += a[f];
//							y += a[f];
//							f++;
//							n--;
//						}
//						move++;
//					}
//					
//					on = true;
//					cur = y;
//					if (n == 0) {
//						break;
//					}
//				}
//
//			}
			System.out.println(move + " " + aVal + " " + bVal);
		}
		input.close();
	}

}
