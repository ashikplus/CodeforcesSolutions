package ashik.codeforces;

import java.util.Scanner;

public class PlaceOfTheOlympiad {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            
            double neededRow = Math.ceil((double) k/n);
            
            double emptyRow = m-neededRow;
            
            double ceil = Math.ceil(neededRow / (emptyRow+1));
            
            System.out.println((int) ceil);
        }
        input.close();
	}

}
