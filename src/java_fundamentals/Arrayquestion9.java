package java_fundamentals;
import java.util.*;
public class Arrayquestion9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int idx=0;
		int res[]=new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]==10) {
			res[idx++]=arr[i];
		}
	}
		while(idx<n) {
			res[idx++]=0;
		}
		System.out.print(Arrays.toString(res));

	}

}
