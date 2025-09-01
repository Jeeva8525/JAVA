/* 
Prints all the permutations of a number
*/


import java.util.Scanner;

class StringLengthGreaterThanTen extends Exception {
    public StringLengthGreaterThanTen(String message) {
        super(message);
    }
}

public class permutation {
    
    public static void generatePermutations(String str, String initial) {
        if (str.length() == 0) {
            System.out.println(initial);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String sub = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(sub, initial + ch);
            }
        }
    }

    public static void printPermutations(String str) throws StringLengthGreaterThanTen {
        if (str.length() > 10) {
            throw new StringLengthGreaterThanTen("String size is greater than 10 : " + str.length());
        }
        generatePermutations(str, "");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = inp.nextLine();
        
        try {
            printPermutations(input);
        } catch (StringLengthGreaterThanTen e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            inp.close();
        }
    }
}
