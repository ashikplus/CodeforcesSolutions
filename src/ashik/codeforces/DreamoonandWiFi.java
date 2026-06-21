package ashik.codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class DreamoonandWiFi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String s1 = input.next();
		String s2 = input.next();

		int ans = 0;
		int ans2 = 0;
		int ques = 0;
		int diff = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '+') {
				ans += 1;
			} else {
				ans -= 1;
			}
		}

		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == '+') {
				ans2 += 1;
			} else if (s2.charAt(i) == '-') {
				ans2 -= 1;
			} else {
				ques++;
			}
		}

		if (ans > ans2) {
			diff = ans - ans2;
		} else {
			diff = ans2 - ans;
		}

		diff = Math.abs(diff);
		int hor = ques;
		int luies = ques;

		int plus = 0;
		long lob = 0;
		while (ques > -1) {

			if (ques == diff) {
				if (plus == 0) {
					lob = 1;
					break;
				} else if (plus == 1) {
					lob = luies;
					break;
				} else if (plus == 2) {
					lob = ((luies * (luies - 1)) / 2);
					break;
				} else {
					lob = (factorial(luies)) / (factorial(plus)*factorial(luies-plus));
					
					break;
				}
			}
			plus++;
			ques-=2;

		}
		
		double ans3 = lob/Math.pow(2, hor);
		System.out.printf("%.12f%n", ans3);
		System.out.println();

	}
	
	public static long factorial(int n) {
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
		return fact.longValue();
	}

}
