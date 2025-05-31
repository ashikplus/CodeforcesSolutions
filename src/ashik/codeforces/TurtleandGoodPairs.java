package ashik.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TurtleandGoodPairs {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            int n = input.nextInt();
            input.nextLine();
            String s = input.next();
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            
			for (char i = 'a'; i <= 'z'; i++) {

				map.put(i, 0);
			}
            
            for(int i=0; i<n; i++) {
            	
            	map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
            
            StringBuilder ob = new StringBuilder();
            char c = 'a';
            for(char d = 'z'; c<d; ) {
            	
            	while(map.get(c) > 0 && map.get(d) > 0) {
            		
            		ob.append(c);
            		ob.append(d);
            		int x = map.get(c);
            		int y = map.get(d);
            		x--;
            		y--;
            		map.put(c, x);
            		map.put(d, y);
            	}
            	
            	if(map.get(c) == 0 &&  map.get(d) == 0) {
            		c++;
            		d--;
            	}else if(map.get(c) == 0) {
            		c++;
            	}else if(map.get(d) == 0) {
            		d--;
            	}
            }
            for(int i=0; i<map.get(c); i++) {
            	ob.append(c);
            }
            System.out.println(ob.toString());
            
        }
        input.close();
	}

}
