package jexception;

//Custom exception
class InvalidAgeException extends Exception {
 InvalidAgeException(String message) {
     super(message);
 }
}

public class Question5 {
 public static void main(String[] args) {
     try {
         if (args.length != 2) {
             throw new IllegalArgumentException("Usage: java ValidateAge <name> <age>");
         }

         String name = args[0];
         int age = Integer.parseInt(args[1]);

         if (age < 18 || age >= 60) {
             throw new InvalidAgeException("Invalid age: Must be >=18 and <60");
         }
         System.out.println("Welcome, " + name + ". Your age " + age + " is valid.");

     } catch (NumberFormatException e) {
         System.out.println("Invalid input: Age must be a number");
     } catch (InvalidAgeException | IllegalArgumentException e) {
         System.out.println(e.getMessage());
     }
 }
}

