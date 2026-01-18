package net.konic.corejava.UserRegistion;

public class RegistrationService {

    // Method declares exceptions using throws
    public void validateUser(String name, int age, String email)
            throws InvalidAgeException, InvalidEmailException {

        if (age < 18) {
            // throw custom age exception
            throw new InvalidAgeException("Age must be 18 or above");
        }

        if (!email.contains("@")) {
            // throw custom email exception
            throw new InvalidEmailException("Email must contain @ symbol");
        }

        System.out.println("User Registration Successful");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}
