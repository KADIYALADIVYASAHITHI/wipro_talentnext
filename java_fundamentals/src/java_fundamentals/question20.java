package java_fundamentals;
import java.util.*;

public class question20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;  // numbers <=1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.print("Prime Number");
        } else {
            System.out.print("Not Prime Number");
        }
    }
}
