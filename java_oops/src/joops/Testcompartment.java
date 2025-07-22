package joops;
import java.util.*;
public class Testcompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment arr[]=new Compartment[10];
		Random rd=new Random();
		for(int i=0;i<arr.length;i++) {
			int res=rd.nextInt(4)+1;
			switch(res) {
			case 1:
				arr[i]=new Firstclass();
				break;
			case 2:
				arr[i]=new Ladies();
				break;
			case 3:
				arr[i]=new General();
				break;
			case 4:
				arr[i]=new Luggage();
				break;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+" "+arr[i].notice());
		}
		

	}

}
