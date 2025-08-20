//Throws an user defined error when a duplicate number is found while entering the input for an array

import java.util.*;

class DuplicateException extends Exception {
    DuplicateException(String message) {
        super(message);
    }
}

public class duplicate {
    static void checkDuplicate(int val, int[] arr) throws DuplicateException {
        if(arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                throw new DuplicateException("Duplicate number found: " + val);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = inp.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            int val = inp.nextInt();
            try {
                checkDuplicate(val,arr);
                arr[i] = val;
            } catch (DuplicateException e) {
                System.err.println("Exception: " + e.getMessage());
                inp.close();
                return;
            }
        }
        inp.close();
    }
}
