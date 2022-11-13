abstract class Employee
{
	String name,city,designation;
	String mobileno;
	Employee(String name,String city, String mobileno,String designation)
	{
		this.name = name;
		this.city = city;
		this.mobileno = mobileno;
		this.designation = designation;
		//this.salary = salary;
		
	}
	abstract void displayinfo();
	
}
class RegularEmp extends Employee
{
	int id;
	double salary;
	RegularEmp(int id,String name,String city,String mobileno,String designation,double salary)
	{
		super(name,city,mobileno,designation);
		this.id = id;
		this.salary = salary;
	}
	void displayinfo()
	{
		System.out.println("id=> "+id+"\nname : "+name+"\nmobile no : "+mobileno+"\n City : "+city+"\nDesignation : "+designation+"\nSalary : "+salary);
	}
	
}
class ContractBasedEmp extends Employee
{
	int id;
	double salary;
	ContractBasedEmp(int id,String name,String city,String mobileno,String designation,double salary)
	{
		super(name,city,mobileno,designation);
		this.id = id;
		this.salary = salary;
	}
	
	void displayinfo()
	{
		System.out.println("id=> "+id+"\nname : "+name+"\nmobile no : "+mobileno+"\nCity : "+city+"\nDesignation : "+designation+"\nSalary : "+salary);
	}
}
public class Q_2
{
	public static void main(String args[])
	{
		ContractBasedEmp ce = new ContractBasedEmp(1,"Renuka Jadhav","Latur","5634856333","Software Engineer",50000);
		RegularEmp re = new RegularEmp(101,"Mayuri Jadhav","Pune","3246378734","Project Engineer",40000);
		re.displayinfo();
		ce.displayinfo();
		
	}
}