//Converts the user given string into a hexaDecimal number , throws error if it is not a valid hexaDecimal Number
import java.util.Scanner;
public class hex2Dec {
    public static void main(String[] args) {
        System.out.print("Enter the hexa Decimal Number: ");
        Scanner inp = new Scanner(System.in);
        String hex = inp.next();
        int decimal = 0;
        try{
            decimal = Integer.parseInt(hex, 16);
        }
        catch (NumberFormatException e) {
            System.err.println("Error : Invalid hexadecimal number.");
            inp.close();
            return;
        }
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Decimal: " + decimal);
        inp.close();
    }
}
