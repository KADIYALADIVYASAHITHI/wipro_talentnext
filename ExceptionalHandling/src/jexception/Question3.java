package jexception;
import java.util.*;
class InvalidException extends Exception{
	InvalidException(String name){
		super(name);
	}
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=1;i<=2;i++) {
				String name=sc.nextLine();
				int marks[]=new int[3];
				for(int j=0;j<marks.length;j++) {
					marks[j]=Integer.parseInt(sc.nextLine());
					if(marks[i]<0 || marks[i]>100) {
						throw new InvalidException("The marks are out of range");
					}
				}
				System.out.println(name);
			}
		}
        catch(NumberFormatException nf) {
        	System.out.println(nf);
        }
		catch(InvalidException e) {
			System.out.print(e);
		}
	}

}
