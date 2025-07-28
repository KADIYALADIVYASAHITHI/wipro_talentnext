package jwrapper;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        if (args.length != 1) {
            System.out.println(" java Test :");
            return;
        }
        int n = Integer.parseInt(args[0]);
        System.out.println("Given Number :" + n);
        System.out.println("Binary Equivalent :" + Integer.toBinaryString(n));
        System.out.println("Octal Equivalent :" + Integer.toOctalString(n));
        System.out.println("Hexa decimal Equivalent :" + Integer.toHexString(n).toUpperCase());
    }
}
