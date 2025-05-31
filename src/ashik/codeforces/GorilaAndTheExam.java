package ashik.codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GorilaAndTheExam {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
            
            int[] a = new int[n];
            
            for(int i=0; i<n; i++) {
            	a[i] = input.nextInt();
            }

            Arrays.sort(a);
            int j = 0;
            
            for(int i=0; i<n; i++) {
            	
            	int c = a[i];
            	int count = 1;
            	j++;
            	
            	while(i<n-1 && c == a[i+1]) {
            		++count;
            		i++;
            	}
            	
            	countMap.put(j, count);
            }
            
            List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(countMap.entrySet());
            sortedList.sort(Map.Entry.comparingByValue());
            
            for (Map.Entry<Integer, Integer> entry : sortedList) {
            	
            	if(k>0 && k - entry.getValue() >= 0) {
            		k = k - entry.getValue();
            		j--;
            	}
            	else {
            		break;
            	}
            }
            if(j==0) {
            	System.out.println(1);
            }else {
            	System.out.println(j);
            }
            
        }
        input.close();
	}

}
