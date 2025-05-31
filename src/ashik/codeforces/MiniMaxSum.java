package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		long [] a = new long[5];
		for(int i=0; i<5; i++) {
			a[i] = input.nextLong();
		}

		Arrays.sort(a);
		
		long su = Arrays.stream(a).sum();
		
		long max = (long)su - a[0];
		
		long min = (long)su - a[4];
		
		System.out.println(min+" "+max);
	}

}
