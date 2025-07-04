package java_fundamentals;
import java.util.*;
public class question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		switch(c) {
		case 'R' :
			System.out.print("Red");
			break;
		
		case 'G' :
            System.out.print("Green");
            break;
		case 'O' :
			System.out.print("Orange");
			break;
		case 'Y' :
            System.out.print("Yellow");
            break;
		case 'W' :
			System.out.print("White");
			break;
		default :
			System.out.print("Invalid Input");
	}
	}
}
