package ashik.codeforces;

import java.util.*;

public class LessorEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        if (k == 0) {
            if (arr[0] == 1) System.out.println(-1);
            else System.out.println(arr[0] - 1);
        } else {
            int x = arr[k - 1];
            
            if (k == n || arr[k - 1] != arr[k]) {
                System.out.println(x);
            } else {
                System.out.println(-1);
            }
        }
    }
}
