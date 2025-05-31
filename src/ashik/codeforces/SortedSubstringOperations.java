package ashik.codeforces;
import java.util.*;

public class SortedSubstringOperations {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int q = sc.nextInt(); 
            String a = sc.next(); 
            String b = sc.next(); 

            int[][] prefixA = new int[n + 1][26];
            int[][] prefixB = new int[n + 1][26];
            
            for (int i = 1; i <= n; i++) {
                System.arraycopy(prefixA[i - 1], 0, prefixA[i], 0, 26);
                prefixA[i][a.charAt(i - 1) - 'a']++;
//                System.out.println(prefixA.toString());
            }

            for (int i = 1; i <= n; i++) {
                System.arraycopy(prefixB[i - 1], 0, prefixB[i], 0, 26);
                prefixB[i][b.charAt(i - 1) - 'a']++;
            }

            for (int qi = 0; qi < q; qi++) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                int diff = 0;
                for (int c = 0; c < 26; c++) {
                    int countA = prefixA[r][c] - prefixA[l - 1][c];
                    int countB = prefixB[r][c] - prefixB[l - 1][c];
                    diff += Math.abs(countA - countB);
                }

                System.out.println(diff / 2);
            }
        }
        sc.close();
    }
}
