//calculates the electricity bill using custom percentages 
import java.util.Scanner;
class electricity {
    String name;
    int custId;
    int unitsConsumed;

    static int tarrifRate = 300;
    static int custCount = 0;
    static int prevCustId = 1000;

    electricity(String n, int u) {
        name = n;
        unitsConsumed = u;

        custCount++;
        custId = ++prevCustId;
    }

    static void updateTarrifRate(int val) {
        if (val <= 0 && val > 1000) {
            System.out.println("Invalid tarrif rate");
            return;
        }
        tarrifRate = val;
    }

    int calculateBill() {
        return unitsConsumed * tarrifRate;
    }

    static int getCustomerCount() {
        return custCount;
    }

}

public class electricityBill {
    public static void main(String[] args) {
        electricity c[] = new electricity[]{new electricity("Ram",25), new electricity("Sam", 30)};

        int choice;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the cust index to do operations: ");
        int index = inp.nextInt();

        choice = -1;
        while(choice != 0){
            System.out.println("\n1 to update Tarrif rate\n2 to calculate bill\n3 to print the total no. of customers registered: ");
            System.out.print("Enter choice: ");
            choice = inp.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the updated Tarrif rate: ");
                    int num = inp.nextInt();
                    electricity.updateTarrifRate(num);
                    break;
                case 2:
                    System.out.println("The bill amount is "+c[index].calculateBill());
                    break;
                case 3:
                    System.out.println("The customer count is "+electricity.getCustomerCount());
                    break;
                default:
                    if(choice != 0)
                    {
                        System.out.println("Invalid Choice");
                    }
                }
        }
        inp.close();
    }
}
