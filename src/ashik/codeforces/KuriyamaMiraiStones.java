package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class KuriyamaMiraiStones {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		long[] v = new long[n];
		long[] vPsum = new long[n];
		long[] vSPsum = new long[n];

		for (int i = 0; i < n; i++) {
			v[i] = input.nextInt();
			if(i!=0) {
				vPsum[i] = v[i] + vPsum[i-1];
			}else {
				vPsum[i] = v[i];
			}	
		}
		
		Arrays.sort(v);
		
		for (int i = 0; i < n; i++) {
			if(i!=0) {
				vSPsum[i] = v[i] + vSPsum[i-1];
			}else {
				vSPsum[i] = v[i];
			}	
		}
		
		int m = input.nextInt();
		long[] ans = new long[m];

		for (int i = 0; i < m; i++) {
			int type = input.nextInt();
			int l = input.nextInt();
			int r = input.nextInt();
			
			if(type == 1) {
				if(l==1) {
					ans[i] = vPsum[r-1];
				}else {
					ans[i] = vPsum[r-1] - (vPsum[l-1] - (vPsum[l-1] - vPsum[l-2]));
				}
			}else {
				if(l==1) {
					ans[i] = vSPsum[r-1];
				}else {
					ans[i] = vSPsum[r-1] - (vSPsum[l-1] - (vSPsum[l-1] - vSPsum[l-2]));
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			System.out.println(ans[i]);
		}
		input.close();
	}

}
