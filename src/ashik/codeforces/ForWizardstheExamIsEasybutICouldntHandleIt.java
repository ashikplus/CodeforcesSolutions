package ashik.codeforces;

import java.util.Scanner;

public class ForWizardstheExamIsEasybutICouldntHandleIt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}

			int left = 1;
			int right = 1;
			int max = 0;
			int count = 0;

			for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					if (a[i] > a[j]) {
						count++;
						if (count > max) {
							left = i + 1;
							right = j + 1;
							max = count;
						}
					} else if (a[i] < a[j]) {
						count--;
					}
				}
				count = 0;
			}
			System.out.println(left + " " + right);
		}
		input.close();
	}

}
