package ashik.codeforces;

import java.util.Scanner;

public class YetAnotherProblemAboutPairsSatisfyinganInequality {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int n = sc.nextInt();
            int count = 0;
            long ans = 0;
            int arr[] = new int[n+1];
            for(int i = 1; i<=n; i++) {
                int curr = sc.nextInt();
                arr[i] = count;
                if(curr<i) {
                    ans += arr[curr];
                    count++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
	}

}
