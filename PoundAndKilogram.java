// This code converts pounds to kilograms and vice versa.
// It prompts the user to choose a conversion type, reads the input value,
// performs the conversion, and displays the result.
import java.util.Scanner;
public class PoundAndKilogram {
    public static void main(String[] args) {
        System.out.print("1 to conversion from pound to Kilogram\n2 to convert Kilogram to pound");
        Scanner inp=new Scanner(System.in);
        double initialValue=0,finalValue=0;
        int choice;
        do
        {
            System.out.print("\nEnter choice: ");
            choice=inp.nextInt();
            if(choice==1)
            {
                System.out.print("Enter pounds: ");
                initialValue=inp.nextFloat();
                finalValue= initialValue * 2.204;
                System.out.println("Kilograms: "+finalValue);
            }
            else if(choice==2)
            {
                System.out.print("Enter Kilograms: ");
                initialValue=inp.nextFloat();
                finalValue=initialValue * 0.453;
                System.out.println("Pounds: "+finalValue);
            }
        
        }while(choice==1 || choice==2);
        inp.close();
    }
}
