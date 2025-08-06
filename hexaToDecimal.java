// This code converts a hexadecimal number to its decimal equivalent.
// It reads a hexadecimal number from the user, processes each character,
// and calculates the decimal value based on the position of each digit.
package JavaPrograms;
import java.util.Scanner;
public class hexaToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter the number in hexaDecimal Format: ");
        Scanner inp=new Scanner(System.in);
        String hex=inp.nextLine();
        int sum=0;
        int length=hex.length();
        int num;
        for(int x=0;x<length;x++)
        {
            if(hex.charAt(x)>='a' && hex.charAt(x)<='f')
            {
                num=((int)hex.charAt(x))-97+10;
            }
            else
            {
                num=(int)hex.charAt(x)-48;
            }
            sum+=num*Math.pow(16,length-x-1);
        }
        System.out.println("The Decimal equivalent is "+sum);
        inp.close();
    }
}
