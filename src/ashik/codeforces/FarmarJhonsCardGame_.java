package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class FarmarJhonsCardGame_ {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			int t = input.nextInt();

			while(t-->0){
				int n = input.nextInt();
				int m = input.nextInt();
				
				int[] p = new int[n];

				for(int i=0; i<n; i++) {
					int sum=0;
					for(int j=0; j<m; j++) {
						sum = sum+input.nextInt();
					}
					p[i] = sum;
				}
				
				Arrays.sort(p);
				int x=n-1;
				int temp = n;
				while(temp > 1) {
					if(p[x] - p[x-1] != n){
						System.out.println("-1");
						return;
					}
					x--;
					temp--;
				}
				
				Integer[] indices = new Integer[p.length];
			    for (int i = 0; i < p.length; i++) {
			        indices[i] = i;
			    }
			    
			    Arrays.sort(indices, (a, b) -> Integer.compare(p[a], p[b]));
			    
			    for (int i = 0; i < indices.length; i++) {
			        indices[i] += 1;
			    }
			    System.out.println("1-based indices: " + Arrays.toString(indices));
			}
			input.close();
		}
	}

}
