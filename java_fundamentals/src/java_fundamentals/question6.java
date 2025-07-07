package java_fundamentals;
import java.util.*;
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		if(a.isEmpty() || b.isEmpty()) {
			System.out.print("No values");
		}
		else {
			System.out.print(a+","+b);
		}

	}

}
