package joops;
import java.util.*;
public class Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String res=Optional.ofNullable(a).orElse("India");
		System.out.println(res);

	}

}
