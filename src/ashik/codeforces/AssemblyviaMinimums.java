package ashik.codeforces;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AssemblyviaMinimums {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            
            int bSize = (n*(n-1))/2;
            
            int[] b = new int[bSize];
            int[] a = new int[n];
            
            for(int i=0; i<bSize; i++) {
            	b[i] = input.nextInt();
            }
            
            Arrays.sort(b);
            int y=1;
            int size=0;
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
            
            for(int i=0; i<bSize; i++) {
            	
            	map.put(b[i], map.getOrDefault(b[i], 0)+1);
            }
            
            int j=0;
            for (Integer key : map.keySet()) {
            	int x = calC(map.get(key), y, n);
            	y+=x;
            	size+=x;
    			for(;j<size;) {
    				a[j] = key;
    				j++;
    			}
            }
            
            if(j != n) {
            	a[n-1] = b[b.length-1];
            }
            
            for(int i=0; i<n; i++) {
            	System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        input.close();
	}

	private static int calC(int count, int y, int n) {
		
		int k=1;
		int z = n-y;
		int sum = z;
		while(true) {
			if(sum==count) {
				return k;
			}else {
				z--;
				sum+=z;
				k++;
			}
		}
	}

}
