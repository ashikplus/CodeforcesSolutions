package ashik.codeforces;

import java.util.Scanner;

public class Perfecto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			long sum = 0;

			sum = ((long) n * (n + 1)) / 2;

			boolean perfectSquare = isPerfectSquare(sum);

			if (perfectSquare) {
				System.out.println(-1);
				continue;
			}
			boolean track = false;

			StringBuilder sb = new StringBuilder();
			
			for (int i = 1; i <= n; i++) {
				
				sum = ((long) i * (i + 1)) / 2;
				
				boolean isPerfectSquare = isPerfectSquare(sum);
				if (isPerfectSquare) {
					sb.append(i+1).append(" ");
					track = true;
				} else if (track) {
					sb.append(i-1).append(" ");
					track = false;
				} else {
					sb.append(i).append(" "); 
				}

			}
			
			System.out.println(sb.toString().trim());

		}
		input.close();
	}

	public static boolean isPerfectSquare(long num) {
		if (num < 0)
			return false;
		long sqrt = (long) Math.sqrt(num);
		return sqrt * sqrt == num;
	}

}
