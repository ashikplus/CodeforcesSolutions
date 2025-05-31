//package ashik.codeforces;
//
//import java.io.*;
//import java.util.*;
//
//public class CraftingWithBuffer {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);
//        
//        int t = Integer.parseInt(br.readLine());
//        while (t-- > 0) {
//            int n = Integer.parseInt(br.readLine());
//            int[] a = new int[n];
//            int[] b = new int[n];
//            
//            // Read array 'a'
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int i = 0; i < n; i++) 
//                a[i] = Integer.parseInt(st.nextToken());
//            
//            // Read array 'b'
//            st = new StringTokenizer(br.readLine());
//            for (int i = 0; i < n; i++) 
//                b[i] = Integer.parseInt(st.nextToken());
//            
//            int minPositive = Integer.MAX_VALUE;
//            int maxNegative = Integer.MIN_VALUE;
//            int minusCount = 0;
//            int equalCount = 0;
//            boolean reject = false;
//            
//            for (int i = 0; i < n; i++) {
//                int diff = a[i] - b[i];
//                
//                if (diff < 0) {
//                    if (++minusCount > 1) { 
//                        reject = true; 
//                        break; 
//                    }
//                    maxNegative = Math.max(maxNegative, diff);
//                } 
//                else if (diff == 0) {
//                    equalCount++;
//                } 
//                else { // diff > 0
//                    minPositive = Math.min(minPositive, diff);
//                }
//                
//                // Original rejection conditions
//                if ((minusCount > 0 && equalCount > 0) || 
//                    (maxNegative < 0 && minPositive != Integer.MAX_VALUE && 
//                     Math.abs(maxNegative) > minPositive)) {
//                    reject = true;
//                    break;
//                }
//            }
//            
//            pw.println(reject ? "No" : "Yes");
//        }
//        pw.flush();
//    }
//}