package account.coforge;

public class Calculator implements Simplecalculator,Scientificcalculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println((float)a/b);
	}

	@Override
	public void power(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(a, b));
		
	}

	@Override
	public void squareroot(double d) {
		// TODO Auto-generated method stub
		System.out.println(Math.sqrt(d));
		
	}

	@Override
	public void log(double nu) {
		// TODO Auto-generated method stub
		System.out.println(Math.log(nu));
		
	}
	

}
