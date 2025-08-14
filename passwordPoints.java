// get password from the user and validates using certaion conditions
import java.util.Scanner;

public class passwordPoints {
    final static int minSubstring = 3;

    static int scoreCalculator(String password) {
        int upper = 0, lower = 0, symbol = 0, digits = 0;
        int len = password.length();
        int score = 0;
        if (len > 15 || len <= 0) {
            System.out.println("please enter a password of length between 8 to 15");
            return -1;
        }
        score += len >= 12 ? 2 : len >= 8 ? 1 : 0;
        for (int x = 0; x < len; x++) {
            if (upper == 0 && Character.isUpperCase(password.charAt(x))) {
                upper = 1;
            }
            if (lower == 0 && Character.isLowerCase(password.charAt(x))) {
                lower = 1;
            }
            if (digits == 0 && Character.isDigit(password.charAt(x))) {
                digits = 1;
                score += 2;
                System.out.println("Digit present\n");
            }
            if (symbol == 0 && !Character.isLetterOrDigit(password.charAt(x))) {
                symbol = 1;
                score += 2;
                System.out.println("Symbol present\n");
            }
        }
        if (upper != 0 && lower != 0) {
            score += 2;
            System.out.println("upper and lower present\n");
        }

        // System.out.println(password.substring(0,minSubstring)==password.substring(4,4+minSubstring));
        for (int x = 0; x < password.length() - minSubstring + 1; x++) {
            for (int y = x + 1; y < password.length() - minSubstring + 1; y++) {
                if (password.substring(x, x + minSubstring).equals(password.substring(y, y + minSubstring))) {
                    score -= 2;
                    System.out.println("repeated sub string is present\n");
                    break;
                }
            }
        }
        return score;
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = inp.next();

        // System.out.println("The result is "+scoreCalculator(password));
        int result = scoreCalculator(password);
        if (result == -1) {
            inp.close();
            return;
        } else if (result < 4) {
            System.out.println("The password is weak");
        } else if (result >= 6) {
            System.out.println("The password is strong");
        } else {
            System.out.println("The password is moderate");
        }
        inp.close();
    }
}