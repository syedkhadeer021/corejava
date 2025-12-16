package net.konic.corejava.encapulation;

public class Mobile {

    private int pin;

    // Setter
    public void setPin(int pin) {
        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
        } else {
            this.pin = -1;   // invalid PIN marker
        }
    }

    // Getter
    public int getPin() {
        return pin;
    }

    public static void main(String[] args) {

        Mobile m = new Mobile();

        int inputPin = 1234;  

        m.setPin(inputPin);

        if (m.getPin() == -1) {
            System.out.println("Invalid PIN");
        } else {
            System.out.println("PIN Set Successfully");
        }
    }
}
