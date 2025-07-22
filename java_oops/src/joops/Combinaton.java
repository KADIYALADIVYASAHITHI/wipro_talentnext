package joops;
import java.util.*;
public class Combinaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String res="";
		int min=Math.min(a.length(), b.length());
		for(int i=0;i<min;i++) {
			res+=""+a.charAt(i)+b.charAt(i);
		}
		if(a.length()>min) {
			res+=a.substring(min);
		}
		if(b.length()>min) {
			res+=b.substring(min);
		}
		System.out.print(res);

	}

}
