package net.konic.corejava.UserRegistion;

import java.util.Scanner;

public class UserRegistrationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RegistrationService service = new RegistrationService();

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            // calling service method
            service.validateUser(name, age, email);

        } catch (InvalidAgeException e) {
            System.out.println("Age Error: " + e.getMessage());

        } catch (InvalidEmailException e) {
            System.out.println("Email Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());

        } finally {
            System.out.println("Registration process completed");
            sc.close();
        }
    }
}
