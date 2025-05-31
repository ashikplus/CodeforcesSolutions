package ashik.codeforces;

import java.util.Scanner;

public class SushiForTwo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] t = new int[n];
        
        for(int i=0; i<n; i++) {
        	t[i] = input.nextInt();
        }
        
        int i=0;
        int result = 1;
        int ans1 = 1;
        int a;
        
        while(true) {
        	
            int count = 0;

        	a = t[i];
        	while(i<n && t[i] == a) {
        		count++;
        		i++;
        	}
        	int ans2 = Math.min(count, result);
        	if(ans1 < ans2) {
        		ans1=ans2;
        	}
        	result = count;

        	if(i==n) {
        		System.out.println(ans1*2);
        		break;
        	}
        }
        input.close();
	}

}
