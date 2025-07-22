package joops;
import java.util.*;
public class Joiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<n;i++) {
			al.add(sc.nextLine());
		}
		StringJoiner sj=new StringJoiner("," , "{" , "}");
		al.forEach(sj::add);
		System.out.print(sj);

	}

}

