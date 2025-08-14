//Implementation of date time format string 
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;

public class loginTime{

    public static LocalDateTime getdate()
    {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        System.out.println("Enter date and time in format yyyy-MM-dd HH:mm:ss (e.g., 2025-07-29'T'15:30:00):");

        String input = scanner.nextLine();

        LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
        scanner.close();
        return dateTime;
    }

    public static void main(String[] args) {

        LocalDateTime intime = getdate();
        LocalDateTime outtime = getdate();
        System.out.print("Login Time: "+intime+"\n");
        System.out.print("Logout Time: "+outtime);

        Duration duration = Duration.between(intime, outtime);

        long totalSeconds = duration.getSeconds();

        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        System.out.println();

        System.out.println("Total Worked Time: " + hours + " hours " + minutes + " minutes " + seconds + " seconds");

        LocalTime time1 = LocalTime.parse("09:00:00");
        LocalTime time2 = LocalTime.parse("15:30:00");

        LocalTime loginTimeOnly = intime.toLocalTime();
        LocalTime logoutTimeOnly = outtime.toLocalTime();


        if (time1.isBefore(loginTimeOnly)) {
        System.out.println("Late: Yes");
        }

        if (time1.isAfter(loginTimeOnly)) {
        System.out.println("Early: Yes");
        }

        if (time1.equals(loginTimeOnly)) {
        System.out.println("Correct Time");
        }

        if (time2.isBefore(logoutTimeOnly)) {
        System.out.println("Left Early: Yes");
        }

        if (time2.isAfter(logoutTimeOnly)) {
        System.out.println("Left Late");
        }

        if (time2.equals(logoutTimeOnly)) {
        System.out.println("Correct Leaving");
        }
    }
}