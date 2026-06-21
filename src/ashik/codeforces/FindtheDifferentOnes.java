package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindtheDifferentOnes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];
			Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
			Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
 
			int j = 0;
			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
				
				if(map1.containsKey(a[i])) {
					map.put(i, map.get(i-1));
				}else {
					map.put(i, map.getOrDefault(i-1, 0) + 1);
					map1.put(a[i], i);
					map2.put(j, i);
					j++;
				}
			}

			int q = input.nextInt();

			for (int i = 0; i < q; i++) {
				
				int l = input.nextInt();
				int r = input.nextInt();
				
				if(l==1) {
					int x = map.get(r-1);
					if(x>=2) {
						System.out.print((map2.get(0)+1)+" ");
						System.out.print(map2.get(1)+1);
					}else {
						System.out.print(-1+" ");
						System.out.print(-1);
					}
					System.out.println();
					continue;
				}
				
				int x = map.get(l-2);
				int y = map.get(r-1);
				int p = map.get(l-1);
				
//				int z = y-x;
				
				int s = y-p;
				
				if(s>=1) {
//					System.out.print((map2.get(s)+1)+" ");
					System.out.print((l)+" ");
//					System.out.print(map2.get(s+1)+1);
					System.out.print(map2.get(p)+1);
				}else {
					System.out.print(-1+" ");
					System.out.print(-1);
				}
				
				System.out.println();
			}
			System.out.println();
			System.out.println();

		}
		input.close();
	}

}
