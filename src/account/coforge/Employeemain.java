package account.coforge;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1= new Employee("Sahil",123,100000);
Employee e2= new Employee("Rahul",234,8900000);
Employee e3= new Employee("Sachin",345,2500000);
Employee.companyname="Coforge Technologies";
System.out.println(e1);
System.out.println(e2);
System.out.println(e3);
e1.calalary();
e2.calalary();
	}

}
