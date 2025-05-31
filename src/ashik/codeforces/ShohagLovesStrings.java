package ashik.codeforces;

import java.util.Scanner;

public class ShohagLovesStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
        	
            String s = input.next();
            int size = s.length();
            StringBuilder sb = new StringBuilder();
            boolean track = false;
            
            for(int i=0; i<size; i++) {
            	
            	if(i+1 < size && s.charAt(i) == s.charAt(i+1)) {
            		System.out.println(sb.append(s.charAt(i)).append(s.charAt(i+1)));
            		track = true;
            		break;
            	}else if(i+2 < size && s.charAt(i) != s.charAt(i+2) && s.charAt(i+1) != s.charAt(i+2)) {
            		System.out.println(sb.append(s.charAt(i)).append(s.charAt(i+1)).append(s.charAt(i+2)));
            		track = true;
            		break;
            	}
            }
            
            if(track == false) {
            	System.out.println(-1);
            }
        }
        input.close();
	}

}
