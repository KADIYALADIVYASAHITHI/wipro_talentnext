package Arrays;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean skip=false;
		int sum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==6) {
				skip=true;
			}
			if(!skip) {
				sum+=arr[i];
			}
			if(skip && arr[i]==7) {
				skip=false;
			}
		}
		System.out.println(sum);

	}

}
