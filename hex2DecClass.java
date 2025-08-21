//Converts hexaDecimalCode into its corresponding binary equivalent , checks for invalid input exception , invalid hexaDecimal Number exception
package lab7;
import java.util.*;
class hexException extends Exception {
    public hexException(String message) {
        super(message);
    }
}
public class hex2DecClass {
    public static void main(String[] args) {
        System.out.print("Enter the hexa Decimal Number: ");
        Scanner inp = new Scanner(System.in);
        String hex = inp.next();
        int decimal = 0;
        try{
            decimal = Integer.parseInt(hex, 16);
            System.out.println("Hexadecimal: " + hex);
            System.out.println("Decimal: " + decimal);
            if (!hex.matches("[0-9A-Fa-f]+")) {
                throw new hexException("Invalid hexadecimal number: " + hex);
            }
        } catch (hexException e) {
            System.err.println("Error : " + e.getMessage());
        } finally {
            inp.close();
        }
    }
}
