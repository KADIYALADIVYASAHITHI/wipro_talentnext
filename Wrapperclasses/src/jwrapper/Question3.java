package jwrapper;
import java.util.Scanner;
public class Question3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 255: ");
        int num = scanner.nextInt();
        if (num < 1 || num > 255) {
            System.out.println("Invalid input! Please enter a value between 1 and 255.");
            return;
        }
        String binaryString = Integer.toBinaryString(num);
        String paddedBinary = String.format("%8s", binaryString).replace(' ', '0');
        System.out.println("Binary (8-bit padded): " + paddedBinary);
    }
}

