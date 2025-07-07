package java_fundamentals;
import java.util.*;
public class question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=a;
		int sum=0;
		while(a>0) {
			int digit=a%10;
			sum=sum*10+digit;
			a/=10;
		}
		if(sum==rev) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not Palindrome");
		}

	}

}
