package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class RemovalsGameOptimize {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = input.nextInt();
			}

			if(Arrays.equals(a, b)) {
				System.out.println("Bob");
				continue;
			}
			
			reverseArray(b);
			
			if(Arrays.equals(a, b)) {
				System.out.println("Bob");
			}else {
				System.out.println("Alice");
			}
			
		}
		input.close();
	}

	public static void reverseArray(int[] arr) {
	    int start = 0, end = arr.length - 1;
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	}
}
