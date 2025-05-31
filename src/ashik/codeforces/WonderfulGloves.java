package ashik.codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WonderfulGloves {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            
            int[] l = new int[n];
            int[] r = new int[n];
            
            for(int i=0; i<n; i++) {
            	
            	l[i] = input.nextInt();
            }
            
            for(int i=0; i<n; i++) {
            	
            	r[i] = input.nextInt();
            }
            
            List<Integer> list = new ArrayList<Integer>();
            
            long sum = 0;
            for(int i=0; i<n; i++) {
            	
            	if(l[i] > r[i]) {
            		sum += l[i];
            		list.add(r[i]);
            	}else {
            		sum += r[i];
            		list.add(l[i]);
            	}
            }
            
            list.sort(Collections.reverseOrder());
            
            for(int i=0; i<k-1; i++) {
            	sum += list.get(i);
            }
            
            System.out.println(sum+1);
//            Map<Integer, Integer> leftMap = new HashMap<Integer, Integer>();
//            Map<Integer, Integer> rightMap = new HashMap<Integer, Integer>();
//            
//            for(int i=1; i<=n; i++) {
//            	leftMap.put(i, input.nextInt());
//            	rightMap.put(i, input.nextInt());
//            }
//            
//            List<Map.Entry<Integer, Integer>> leftSortedMap = leftMap.entrySet()
//            	    .stream()
//            	    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()) 
//            	    .collect(Collectors.toList());
//            
//            List<Map.Entry<Integer, Integer>> rightSortedMap = rightMap.entrySet()
//            	    .stream()
//            	    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()) 
//            	    .collect(Collectors.toList());
            
            
        }
        input.close();
	}

}
