package ashik.codeforces;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long n = input.nextLong();

        String str = String.valueOf(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int digit = ch - '0';

            int newDigit = digit;

            if (digit >= 5) {
                newDigit = 9 - digit;
            }

            if (i == 0 && newDigit == 0) {
                newDigit = digit;
            }

            result.append(newDigit);
        }

        System.out.println(result.toString());
        
        input.close();
    }
}