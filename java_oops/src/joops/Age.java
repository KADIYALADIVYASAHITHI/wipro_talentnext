package joops;
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Age {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Please provide exactly 2 arguments: name and age.");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Invalid age: " + age + ". Age must be >=18 and <60.");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("User input is valid.");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: age must be an integer.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
