/* 
Checks for a number is even, if not throws an exception
*/
import java.util.Scanner;
class OddNumberException extends Exception {
    OddNumberException(String message) {
        super(message);
    }
}
public class Odd {
    public static void checkEven(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Odd number: " + num);
        } else {
            System.out.println("The number is: " + num);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = inp.nextInt();
        
        try {
            checkEven(number);
        } catch (OddNumberException e) {
            System.err.println("Exception : " + e.getMessage());
        } finally {
            inp.close();
        }
    }
}
