package ashik.codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ServalAndFinalMEX {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int min = 6000;
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int[] a = new int[n];
			int position = 0;
			int zero = 0;
			boolean zeroFirstOccurance = true;
			boolean oneFirstOccurance = true;
			
			int firstZero = 0;
			int firstOne = 1;

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();

				if (a[i] == 0) {
					
					if(zeroFirstOccurance) {
						firstZero = i+1;
						zeroFirstOccurance = false;
					}
				} else if (a[i] == 1) {
					if(oneFirstOccurance) {
						firstOne = i+1;
						oneFirstOccurance = false;
					}
				}

				if (a[i] < min) {
					min = a[i];
					position = i + 1;
				}

			}

			if (min == 1) {
				System.out.println(1);
				System.out.println(1 + " " + n);
			} else if (min == 0) {

				if(oneFirstOccurance == false && firstOne < firstZero) {
					if(firstZero == n) {
						System.out.println(2);
						System.out.println((firstZero - 1)+" "+firstZero);
						System.out.println(1 +" "+(firstZero - 1));
					}else {
						System.out.println(2);
						System.out.println(firstZero +" "+n);
						System.out.println(1+" "+firstZero);
					}
				}else if(oneFirstOccurance) {
					System.out.println(1);
					System.out.println(1+" "+n);
				}else if(firstOne > firstZero){
					
					if(firstZero  > 1) {
						
						System.out.println(2);
						System.out.println(firstZero + " "+(firstZero - 1));
						System.out.println(1+" "+(n-1));
					}
				}
			} else {

				int diff = n - position;
				int k = 0;
				System.out.println(min);
				while (diff != 0 && min != 1) {
					System.out.println(position + " " + (position + 1));
					diff--;
					min--;
					k++;
				}

				if (min == 1) {
					System.out.println(1 + " " + (n - k));
				} else {
					while (min != 1) {
						System.out.println((position - 1) + " " + position);
						min--;
						position--;
					}

					System.out.println(1 + " " + position);
				}

			}

		}
		input.close();
	}

}
