package account.coforge;

public class DemoFinal {
	private final String name="Aman";
	
	public void printDetails() {
		//this.name="Aman";
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		DemoFinal doit= new DemoFinal();
		doit.printDetails();
	}

}
