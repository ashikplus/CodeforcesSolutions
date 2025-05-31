package ashik.codeforces;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RightLeftWrong {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			input.nextLine();

			String s = input.next();

			int size = s.length();
			TreeMap<Integer, Points> map = new TreeMap<Integer, Points>();
			boolean track = false;

			int k=1;
			for (int i = 0, j = size - 1; i < j; i++,j--) {
				
				while (i < j && s.charAt(i) != 'L') {
					i++;
				}

				while (i < j && s.charAt(j) != 'R') {
					j--;
				}

				if (i >= j) {
					if(i==0 || j == size-1) {
						System.out.println(0);
						track = true;
					}
					break;
				}
				
				Points points = new Points(i, j);
				map.put(k, points);
				k++;

			}
			
			long score=0;
			long sum=0;
			int m=0;
			int prevX = 0;
			int prevY = 0;
			for (Map.Entry<Integer, Points> entry : map.descendingMap().entrySet()) {

				long ss = 0;
				if(m==0) {
					for(int i = entry.getValue().x; i<= entry.getValue().y; i++) {
						ss+=a[i];
					}
				}else {
					for(int j = entry.getValue().x; j<prevX; j++) {
						ss+=a[j];
					}
					for(int j = prevY+1; j<=entry.getValue().y; j++) {
						ss+=a[j];
					}
				}
				sum += ss;
				
				score += sum;
				m++;
				
				prevX = entry.getValue().x;
				prevY = entry.getValue().y;
	        }
			if(!track)
			System.out.println(score);
		}
		input.close();
	}

	static class Points {
		int x;
		int y;

		Points(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
