package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfMathletes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while(t-->0){
			int n = input.nextInt();
			int k = input.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) arr[i] = input.nextInt();
			Arrays.sort(arr);
			int i = 0, j = n -1, count= 0;
			while(i<j){
			    if(arr[i] + arr[j] == k) {count++; i++; j--;}
			    else if(arr[i]+arr[j]<k) i++;
			    else j--;
			}
			System.out.println(count);
			}
		input.close();
	}

}
