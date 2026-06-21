package ashik.codeforces;

import java.util.Scanner;
import java.util.TreeMap;

public class Polygon {

	@Override
	public String toString() {
		return i + " " + j;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			input.nextLine();

			char[][] a = new char[n][n];
			TreeMap<Integer, Polygon> map = new TreeMap<Integer, Polygon>();

			for (int i = 0; i < n; i++) {
				String row = input.nextLine().trim();
				a[i] = row.toCharArray();
			}
			int index = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i][j] == '1') {
						Polygon pol = new Polygon();
						pol.i = i;
						pol.j = j;
						map.put(index, pol);
						index++;
					}
				}
			}
			
			String ans = "Yes";

			for (int key : map.keySet()) {
				Polygon polygon = map.get(key);
				int i = polygon.i;
				int j = polygon.j;
				if (i == 0 || i == 1 || j == 0 || j == 1 || i == n - 1 || i == n - 2 || j == n - 1 || j == n - 2) {
					if(i==n-1 || j==n-1 || a[i][j+1] =='1' || a[i+1][j] == '1') {
						continue;
					}else {
						ans = "No";
					}
				}

			}
			System.out.println(ans);
		}
		input.close();
	}

	int i;
	int j;

}
