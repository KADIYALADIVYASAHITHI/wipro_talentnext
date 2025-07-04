package java_fundamentals;
import java.util.*;
public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      char a=sc.next().charAt(0);
      if(Character.isLowerCase(a)) {
    	  System.out.print(Character.toUpperCase(a));
      }
      else {
    	  System.out.print(Character.toLowerCase(a));
      }
	}

}
