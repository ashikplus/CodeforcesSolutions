package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindtheDifferentOnesOptimized {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n+1];
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
 
			for (int i = 1; i <= n; i++) {
				a[i] = input.nextInt();
			}
			
			int b=1;
			for(int i=1; i<=n; i++) {
				
				b++;
				int c=a[i];
				int k=i;
				while(i+1 <= n && c == a[i+1]) {
					b++;
					i++;
					if(i+1>n) {
						b++;
					}
				}
				
				for(int j=k; j<=i; j++) {
					map.put(j, b);
					
				}
			}
			
			int q = input.nextInt();
			
			for(int i=0; i<q; i++) {
				
				int l = input.nextInt();
				int r = input.nextInt();
				
				int nextOne = map.get(l);
				if(nextOne<=r) {
					System.out.print(l+" "+nextOne);
				}else {
					System.out.print(-1+" "+(-1));
				}
				System.out.println();
			}
			System.out.println();

		}
		input.close();
	}

}
