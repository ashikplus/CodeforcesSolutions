package ashik.codeforces;

import java.util.Scanner;

public class CheapTravel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		
//		int x = n/m;
//		int y = n%m;
//		
//		int z = x*b;
//		int i = y*a;
//		
//		int firstRes = z+i;
//		
//		int secondRes = n*a;
//		
//		int finalRes = Math.min(firstRes, secondRes);
//		
//		System.out.println(finalRes);
		
		int i = a/1;
		
		int j = b/m;
		
		if(i<j) {
			System.out.println(n*a);
		}else {
			int k = n%m;
			
			if(k == 0) {
				System.out.println(m/n);
			}else {
				if(a<b) {
					
				}
				System.out.println();
			}
		}
		
		input.close();
	}

}
