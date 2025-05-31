package ashik.codeforces;

import java.util.Scanner;

public class TrippiTroppi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine(); 
        while (t-- > 0) {
            String text = input.nextLine();
            
            String[] words = text.split(" ");
            
            String ans = "";
            
            for(int i=0; i<3; i++) {
            	ans+=words[i].charAt(0);
            }
            
            System.out.println(ans);
        }
        input.close();
	}

}
