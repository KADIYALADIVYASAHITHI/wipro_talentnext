package joops;
import java.util.*;
public class Repitations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int b=sc.nextInt();
		String str="";
		if(b<a.length()) {
			str+=a.substring(a.length()-b);
		}
		for(int i=0;i<b;i++) {
			System.out.print(str);
		}

	}

}
