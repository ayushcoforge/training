package account.coforge;

public class Outer {
	static String name;
	public void printDetails() {
		this.name="Ayush";
		System.out.println("Name:" +this.name);
	}
	static class Inner{
		private String InnerName;
		public void printdetails() {
			this.InnerName="xyz";
			System.out.println(InnerName);
		}
	}
	public static void main(String[]args) {
		Outer out= new Outer();
		out.printDetails();
	Inner nn= new Inner();
		nn.printdetails();
	}

}
