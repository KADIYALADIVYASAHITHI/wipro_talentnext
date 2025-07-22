package joops;

import java.util.Scanner;

class Box {
	double height, width, length;
	Box(double h, double w, double l) {
		height = h;
		width = w;
		length = l;
	}
	double volume() {
		return height * width * length;
	}
}

public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width of the box: ");
		double width = sc.nextDouble();
		System.out.print("Enter height of the box: ");
		double height = sc.nextDouble();
		System.out.print("Enter depth of the box: ");
		double depth = sc.nextDouble();
		Box myBox = new Box(width, height, depth);

		System.out.print(myBox.volume());

	}
}

