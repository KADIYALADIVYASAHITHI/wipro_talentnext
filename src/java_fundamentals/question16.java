package java_fundamentals;
import java.util.*;
public class question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
	    while(a>0) {
			int digit=a%10;
			sum=sum+digit;
			a/=10;
		}
     System.out.print(sum);
	}

}
