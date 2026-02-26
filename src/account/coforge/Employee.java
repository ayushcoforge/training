package account.coforge;

public class Employee {
	private String name; 
	private int id;
	private double bsalary;
	public static String companyname= "Coforge";
	public Employee() {
		super();
	}
	public Employee(String name, int id,double bsalary) {
		super();
		this.name = name;
		this.id = id;
		this.bsalary=bsalary;
		//this.companyname = companyname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public double getBsalary() {
		return bsalary;
	}
	public void setBsalary(double bsalary) {
		this.bsalary = bsalary;
	}

	//public void setCompanyname(String companyname) {
		//this.companyname = companyname;
	//}
	
	public void calalary() {
		double netsalary;
		if(this.bsalary>50000) {
			double hra=0.10;
			double da=0.10;
			netsalary=bsalary+bsalary*hra+bsalary*da;
		}
		else {
			netsalary=bsalary;
		}
		System.out.println("net salary :" +netsalary);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", bsalary=" + bsalary + "]";
	}
	
	
	

}
