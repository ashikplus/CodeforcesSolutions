package ashik.codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MinimizeEqualSumSubarrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] p = new int[n];
			int[] l = new int[n];

			for (int i = 0; i < n; i++) {
				p[i] = input.nextInt();
			}

			for(int i=1; i<n; i++) {
				l[i] = p[i-1];
			}
			l[0] = p[n-1];
			
			for(int i=0; i<n; i++) {
				System.out.print(l[i]+" ");
			}
			
			
//			List<Integer> list = Arrays.stream(l).boxed().collect(Collectors.toList());
//
//			Collections.reverse(list);
//
//			System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));

		}
		input.close();
	}

}
