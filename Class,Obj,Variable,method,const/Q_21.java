//Java Program to Allocate and Initialize Super Class Members using Constructor
import java.util.Scanner;
class Employee
{
	int empId,age;
	String Name,city,designation;
	
	Employee(int empId,int age,String name,String city,String designation)
	{
		this.empId = empId;
		this.designation = designation;
		this.age = age;
		this.Name = name;
		this.city = city;
	}
}
class ContractBasedEmp extends Employee
{
	int yeartowork;
	ContractBasedEmp(int id,int age,String name,String city,String designation,int yeartowork)
	{
		super(id,age,name,city,designation);
		this.yeartowork = yeartowork;
	}
	void display()
	{
		System.out.println("id = "+empId);
		System.out.println("Age = "+age);
		System.out.println("Name = "+Name);
		System.out.println("City = "+city);
		System.out.println("Designation	= "+designation);	
		System.out.println("Year : "+yeartowork);
	}
} 
class Q_21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Name : ");
		String name = sc.next();
		
		System.out.println("Enter City : ");
		String city = sc.next();
		
		System.out.println("Enter Designation : ");
		String designation = sc.next();
		
		System.out.println("Enter time period to work : ");
		int  year = sc.nextInt();
		
		ContractBasedEmp c1 = new ContractBasedEmp(id,age,name,city,designation,year);
		c1.display();
	}
}