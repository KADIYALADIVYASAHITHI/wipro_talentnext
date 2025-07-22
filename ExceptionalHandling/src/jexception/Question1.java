package jexception;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	try {
    	int n=Integer.parseInt(sc.nextLine());
    	int arr[]=new int[n];
    	System.out.println("Enter the elements in the array");
    	for(int i=0;i<n;i++) {
    		arr[i]=Integer.parseInt(sc.nextLine());
    	}  
    	int res=Integer.parseInt(sc.nextLine());
    	System.out.println(arr[res]);
    	 System.out.println("The array element successfully accessed");
    	}
    	catch(ArrayIndexOutOfBoundsException ae) {
    		System.out.println("java.lang.ArrayIndexOutOfBoundsException");
    	}
    	catch(NumberFormatException n) {
    		System.out.println("java.lang.NumberFormatException");
    	}
    	
    }
}

