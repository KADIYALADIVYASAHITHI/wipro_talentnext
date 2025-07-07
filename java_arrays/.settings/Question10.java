package Arrays;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		List<Integer> even=new ArrayList<>();
		List<Integer> odd=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even.add(arr[i]);
			}
			else {
				odd.add(arr[i]);
			}
		}
		even.addAll(odd);
		System.out.print(even);
		

	}

}
