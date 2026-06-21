package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class VanyaandLanterns {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int l = input.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		
		Arrays.sort(a);
		
		int maxVal = Math.abs((0-a[0]));
		
		maxVal = Math.max(maxVal, Math.abs((a[n-1])-l));
		int max = maxVal;
		boolean track = true;
		
		for(int i=0; i<n-1; i++) {
			int tempMax = Math.abs((a[i]-a[i+1]));
			maxVal = Math.max(maxVal, tempMax);
			if(maxVal / 2.0 > (double) max) {
				track = false;
			}
		}
		
		if(track) {
			System.out.printf("%.10f\n", (double) max);
		}else {
			System.out.printf("%.10f\n", (maxVal/2.0));
		}
		
		
		input.close();
	}

}
