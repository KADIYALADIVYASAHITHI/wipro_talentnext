package java_fundamentals;
import java.util.*;
public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(Character.isDigit(a)) {
			System.out.print("Digit");
		}
		else if(Character.isAlphabetic(a)) {
			System.out.print("Alphabet");
		}
		else {
			System.out.print("Special Characters");
		}

	}

}
