package net.konic.corejava.inheritance;
class Bank {
    void deposit() {
        System.out.println("Deposit successful");
    }
}

class SBI extends Bank {
    void sbiFeatures() {
        System.out.println("SBI: Unlimited ATM withdrawals");
    }
}

public class BankSBIDemo {
    public static void main(String[] args) {
        
        SBI s = new SBI();
        s.deposit();
        s.sbiFeatures();
    }
}
