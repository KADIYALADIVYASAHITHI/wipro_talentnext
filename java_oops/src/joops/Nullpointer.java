package joops;
import java.util.*;
public class Nullpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]=new String[5];
        Optional<String> op=Optional.ofNullable(str[0]);
       if(op.isPresent()) {
    	   System.out.print(op.get().length());
       }
       else {
    	   System.out.print("str[0] is null");
       }
	}

}
