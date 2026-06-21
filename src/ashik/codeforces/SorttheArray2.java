package ashik.codeforces;

import java.util.Scanner;

public class SorttheArray2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = sc.nextInt();
		int i = 1, j, k;
		while (i < n && a[i] < a[i + 1])
			i++;
		j = i;
		while (j < n && a[j] > a[j + 1])
			j++;
		k = j;
		while (k < n && a[k] < a[k + 1])
			k++;
		if (k == n) {
			int f = 1;
			if (i > 1)
				if (a[j] < a[i - 1])
					f = 0;
			if (j < n)
				if (a[i] > a[j + 1])
					f = 0;
			if (f == 1) {
				System.out.println("yes");
				System.out.printf("%d %d\n", i, j);
			} else
				System.out.println("no");
		} else
			System.out.println("no");
	}

}
