import java.util.Scanner;
import java.util.InputMismatchException;

public class MonthDaysString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        int[] dom = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        int ch;
        System.out.print("Enter the month number (1-12): ");

        try {
            ch = inp.nextInt();
            System.out.println(months[ch - 1] + " has " + dom[ch - 1] + " days.");
        } catch (InputMismatchException e) {
            System.err.println("Error : Please enter a valid integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error : Invalid month number.");
        } finally {
            inp.close();
        }
    }
}
