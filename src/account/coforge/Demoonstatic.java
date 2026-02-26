package account.coforge;

public class Demoonstatic {
	static {
		System.out.println("first static block");
	}
	static {
		System.out.println("second");
	}
	public static void printname(String name) {
		System.out.println(name);
	}
	public static void main(String[]args) {
		System.out.println("Inside main");
		printname("xyz");
		}
		static {
			System.out.println("third");}
		static {
System.out.println("fourth");	}

}
