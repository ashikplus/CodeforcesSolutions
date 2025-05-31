package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class LLPS {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String s = input.next();
		
		char[] charArray = s.toCharArray();
		
        Arrays.sort(charArray);
        
        char lastElement = charArray[s.length()-1];
        int i = s.length()-1;
        String output="";
        
        while(i >= 0 && lastElement == charArray[i]) {
        	
        	output += charArray[i];
        	i--;
        }
        
        System.out.println(output);
        input.close();
	}

}
