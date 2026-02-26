package account.coforge;

public class Circle implements Shape{
	private int radius;
	

	public Circle(double radius) {
		super();
		this.radius = (int) radius;
	}

	public Circle() {
		super();
	}

	@Override
	public void area() {
		System.out.println(Math.PI*radius*radius);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perimeter() {
		System.out.println(2*Math.PI*radius);
		// TODO Auto-generated method stub
		
	}

}
