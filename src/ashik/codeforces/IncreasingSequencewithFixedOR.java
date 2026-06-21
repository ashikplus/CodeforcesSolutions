package ashik.codeforces;

import java.util.PriorityQueue;
import java.util.Scanner;

public class IncreasingSequencewithFixedOR {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			long n = input.nextLong();
			PriorityQueue<Long> pq = new PriorityQueue<>();
			pq.add(n);

			for (int i = 0; i < 60; i++) {
				if ((n & (1L << i)) != 0) {
					long newVal = n - (1L << i);
					if(newVal != 0) {
						pq.add(newVal);
					}
					
				}
			}
			
			System.out.println(pq.size());
			while (!pq.isEmpty()) {
				System.out.print(pq.poll() + " "); 
			}
			System.out.println();

		}
		input.close();
	}

}
