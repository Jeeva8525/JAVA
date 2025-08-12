//Overrding concepts , calling default methods in parent classes
interface Printer {
    default void connect() {
        System.out.println("Connecting to printer\n");
    }
}

interface Scanner {
    default void connect() {
        System.out.println("Connecting to scanner\n");
    }
}

class AllInOneDevice implements Printer, Scanner {
    @Override
    public void connect() {
        System.out.println("Connecting to all-in-one-device\n");
        Printer.super.connect();
        Scanner.super.connect();
    }
}

public class connect {
    public static void main(String[] args) {
        AllInOneDevice device = new AllInOneDevice();
        device.connect();
    }
}
