package Jinterface;
 interface Vehicle{
	default void message() {
		System.out.println("Inside message");
	}
}
 interface FourWheeler{
		default void message() {
			System.out.println("Inside Fourwheeler");
		}
	}

class Car implements Vehicle, FourWheeler {
    public void message() {
        Vehicle.super.message();
        FourWheeler.super.message();
        System.out.println("Inside Car");
    }
}
public class Main {
     public static void main(String[] args){
    	 Car c=new Car();
    	 c.message();
     }
}
