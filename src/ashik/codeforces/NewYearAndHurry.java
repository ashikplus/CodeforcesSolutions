package ashik.codeforces;

import java.util.Scanner;

public class NewYearAndHurry {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int k = input.nextInt();
		
		int one = 5;
		int two = 15;
		int three = 30;
		int four = 50;
		int five = 75;
		int six = 105;
		int seven = 140;
		int eight = 180;
		int nine = 225;
		int ten = 275;
		
		int minute = 240 - k;
		
		if(minute < one) {
			System.out.println(0);
		}else if(minute < two) {
			System.out.println(n>=1 ? 1 : n);
		}else if(minute < three) {
			System.out.println(n>=2 ? 2 : n);
		}else if(minute < four) {
			System.out.println(n>=3 ? 3 : n);
		}else if(minute < five) {
			System.out.println(n>=4 ? 4 : n);
		}else if(minute < six) {
			System.out.println(n>=5 ? 5 : n);
		}else if(minute < seven) {
			System.out.println(n>=6 ? 6 : n);
		}else if(minute < eight) {
			System.out.println(n>=7 ? 7 : n);
		}else if(minute < nine) {
			System.out.println(n>=8 ? 8 : n);
		}else if(minute < ten) {
			System.out.println(n>=9 ? 9 : n);
		}
		
		input.close();
	}

}
