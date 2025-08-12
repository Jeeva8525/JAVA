//Implements miniature bank model using final keywords

final class Bank {
    private final String accNum, accHolderName;
    private final double balance;

    Bank(String no, String name, double bal) {
        accNum = no;
        accHolderName = name;
        balance = bal;
    }

    void getter() {
        System.out.println("The details of the account is\n");
        System.out.println("Acc No : " + accNum + "\nAccount Holder Name : " + accHolderName + "\nBalance : " + balance+"\n");
    }

    Bank deposit(double amount) {
        Bank temp = new Bank(accNum, accHolderName, balance + amount);
        return temp;
    }

    Bank withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance\n");
            return this;
        }
        Bank temp = new Bank(accNum, accHolderName, balance - amount);
        return temp;
    }

    public String toString(){
        return "Acc No : " + accNum + "\nAccount Holder Name : " + accHolderName + "\nBalance : " + balance;
    }
}

// class test extends Bank{}        throws error because Bank class is final
public class bankAccount {
    public static void main(String[] args) {
        Bank obj = new Bank("1234", "Tom", 17234.50);
        obj.getter();
        obj = obj.deposit(2000);
        obj.getter();
        obj = obj.withdraw(3000);
        obj.getter();
        System.out.println("Printing the details of the account using toString method");
        System.out.println(obj);
    }
}
