package java_fundamentals;
import java.util.*;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String a=sc.nextLine();
       //sc.nextInt();
       int age=sc.nextInt();
       if(a.equals("male") && age >=1 && age<=58) {
    	   System.out.print("percentage-8.4%");
       }
       else if(a.equals("male") && age>=59 && age<=100) {
    	   System.out.print("percentage-10.5%");
       }
       if(a.equals("female") && age>=1 && age <=58) {
    	   System.out.print("percentage-8.2%");
    	   
       }
       else if(a.equals("female") && age>= 58 && age<=100) {
    	   System.out.print("percentage-9.2%");
       }
       else {
    	   System.out.print("Not found");
       }
	}

}

