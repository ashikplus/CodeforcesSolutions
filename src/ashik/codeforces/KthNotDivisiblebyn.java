package ashik.codeforces;
import java.util.Scanner;

public class KthNotDivisiblebyn {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int k = input.nextInt();
			int l = k;
			int ans = k / n;
			int ans2 = ans;
			if (ans == 0) {
				System.out.println(k);
				continue;
			}

			l += ans;
			ans = l / n;

			while (ans != ans2) {

				int x = ans - ans2;
				ans2 = ans;
				l += x;
				ans = l / n;
				
			}
			
			System.out.println(l);
		}
		input.close();
	}

}
