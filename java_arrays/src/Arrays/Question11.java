package Arrays;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean avg=true;
		for(int num : arr) {
			if(num!=1 && num!=4) {
				avg=false;
				break;
			}
		}
		System.out.print(avg);

	}

}
