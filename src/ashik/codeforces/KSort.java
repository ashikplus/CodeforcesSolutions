package ashik.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			long[] a = new long[n];
			List<Long> list = new ArrayList<>();
			int count = 0;
			long ans = 0;

			for (int i = 0; i < n; i++) {
				a[i] = input.nextLong();
			}

			for (int i = 0; i < n; i++) {
				long x = a[i];
				while (i + 1 < n && x > a[i + 1]) {
					long y = x - a[i + 1];
					list.add(y);
					count++;
					i++;
				}
			}

			Collections.sort(list);
			long sum = 0;
//            int j = 0;
			
			for (int i = 0; i < list.size(); i++) {

				long x = list.get(i) - sum;
				ans += (count+1) * x;
				sum += x;
				count--;

			}
			
			System.out.println(ans);

//            while (count > 0) {
//            	
//                long cnt = count + 1; 
//                 //
//                long res = cnt * list.get(j);  
//                ans += res;
//                count--;
//
//                long firstElement = list.get(j);//
//                
//                for (int i = 0; i < list.size(); i++) {
//                	if(list.get(i) !=0) {
//                		list.set(i, list.get(i) - firstElement);
//                	}
//                }
//                j++;
//            }

//			System.out.println(ans);
		}
		input.close();
	}
}