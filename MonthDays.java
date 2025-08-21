//converts the month number into its corresponding no. of days in that month
import java.util.Scanner;
public class MonthDays {
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
        ch = inp.nextInt();

        try {
            System.out.println(months[ch - 1] + " has " + dom[ch - 1] + " days.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error : Invalid month number.");
        }
        inp.close();
    }
}
