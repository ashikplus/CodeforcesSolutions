package ashik.codeforces;
import java.util.Scanner;

public class GreedyPathGrid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt(); 
        
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            
            if (n == 1 || m == 1 || (n==2 && m==2)) {
                System.out.println("No");
            } else {
                System.out.println("YES");
            }
        }

        input.close();
    }
}
