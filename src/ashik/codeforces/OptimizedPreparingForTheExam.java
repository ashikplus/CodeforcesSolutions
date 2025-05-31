package ashik.codeforces;
import java.io.*;
import java.util.*;

public class OptimizedPreparingForTheExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            int[] a = new int[m];
            int[] q = new int[k];
            
            // Read array a
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            // Read array q
            st = new StringTokenizer(br.readLine());
            Set<Integer> qSet = new HashSet<>();  // Using HashSet for O(1) lookups
            for (int i = 0; i < k; i++) {
                q[i] = Integer.parseInt(st.nextToken());
                qSet.add(q[i]);
            }
            
            StringBuilder ans = new StringBuilder(m);
            
            if (n - k > 1) {
                // Fill with all 0s
                for (int i = 0; i < m; i++) {
                    ans.append('0');
                }
            } else if (n == k) {
                // Fill with all 1s
                for (int i = 0; i < m; i++) {
                    ans.append('1');
                }
            } else {
                // Build answer based on presence in q
                for (int i = 0; i < m; i++) {
                    ans.append(qSet.contains(a[i]) ? '0' : '1');
                }
            }
            
            pw.println(ans);
        }
        pw.flush();
    }
}