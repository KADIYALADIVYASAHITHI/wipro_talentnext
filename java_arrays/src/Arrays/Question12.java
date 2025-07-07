package Arrays;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int a[]=new int[3];
		int b[]=new int[3];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		int res[]= {a[1],b[1]};
		System.out.print(Arrays.toString(res));

	}

}
