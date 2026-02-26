package account.coforge;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type;
		Shape sh;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type");
		type= sc.next();
		if(type.equals("Circle")) {
			System.out.println("Enter radius");
			double r= sc.nextDouble();
		 sh=new Circle(r);
			sh.area();
			sh.perimeter();
		}
		else if(type.equals("Square")) {
			System.out.println("side");
			double s= sc.nextDouble();
			sh=new Square(s);
			sh.area();
			sh.perimeter();
		}
	}

}
