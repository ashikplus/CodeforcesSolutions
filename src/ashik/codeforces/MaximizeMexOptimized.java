package ashik.codeforces;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MaximizeMexOptimized {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int x = input.nextInt();

			int[] a = new int[n];
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			
			Set<Integer> set = new HashSet<Integer>();

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
				if (map.containsKey(a[i])) {
					int value = map.get(a[i]);
					value = value+1;
					map.put(a[i], value);
					
					set.add(a[i] + x);
				} else {
					map.put(a[i], 1);
				}
			}
			
			int i=0;
			boolean track = false;
//			boolean on = false;
			outer:
			for(; i<n; ) {
				
				if(track) {
					if(!map.containsKey(i)) {
						
						if(set.contains(i)) {
							
							i++;
							continue;
						}else {
							System.out.println(i);
							break;
						}
					}else {
						i++;
						continue;
					}
				}
				
				track = true;
				for (Integer key : map.keySet()) {

					if(key != i) {
						
						if(set.contains(i) && map.containsKey(i - x) && map.get(i - x) > 1) {
							
							int value = map.get(i-x);
							value--;
							map.put(a[i-x], value);
							if(value > 1) {
								set.add(i+x);
							}
							i+=2;
						}else {
							System.out.println(i);
							break outer;
						}
						
					}else {
						if(set.contains(key)) {
							set.add(key+x);
						}
						i++;
					}
				}
			}
			if(i==n) {
				System.out.println(n);
			}
			
		}
		input.close();
	}

}
