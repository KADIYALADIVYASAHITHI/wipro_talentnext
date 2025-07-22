package jexception;
import java.util.*;
 class InvalidCountryException extends Exception {
	 InvalidCountryException(String message){
		 super(message);
	 }
}
 public class Question4{
	 public void registerUser(String name,String country) throws InvalidCountryException{
		 if(!country.equalsIgnoreCase("India")){
			 throw new InvalidCountryException("User outside India cannot be registered");
		 }
		 else {
			 System.out.println("User registered successfully");
		 }
	 }
	 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 try {
		 String name=sc.nextLine();
		 String country=sc.nextLine();
		 Question4 ur=new  Question4();
		 ur.registerUser(name,country);
		 
	 }
	 catch(InvalidCountryException e) {
		 System.out.print(e.getMessage());
	 }
	 }
 }

