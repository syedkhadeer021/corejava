package net.konic.corejava.isas;

class BankLoan {
 void calculateEMI() {
     System.out.println("Calculating EMI...");
 }
}

class HomeLoan extends BankLoan {
 
 void calculateEMI() {
     System.out.println("Calculating EMI for Home Loan");
 }
}

class CarLoan extends BankLoan {
 
 void calculateEMI() {
     System.out.println("Calculating EMI for Car Loan");
 }
}

public class LoanDemo {
 public static void main(String[] args) {

     HomeLoan hl = new HomeLoan();
     CarLoan cl = new CarLoan();

     hl.calculateEMI();
     cl.calculateEMI();
 }
}
