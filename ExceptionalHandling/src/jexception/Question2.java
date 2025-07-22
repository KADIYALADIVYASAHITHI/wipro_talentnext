package jexception;
import java.util.*;
public class Question2 {

	public static void main(String[] args) throws ArithmeticException, NumberFormatException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			int n=5,sum=0;
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=Integer.parseInt(sc.nextLine());
				sum=sum+arr[i];
			}
			System.out.println(sum);
			int avg=sum/n;
			System.out.println(avg);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
			throw ae;
		}
		catch(NumberFormatException e) {
			System.out.print(e.toString());
			throw e;
		}
		

	}

}
