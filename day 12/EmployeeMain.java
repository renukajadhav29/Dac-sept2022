import java.util.*;

abstract class Employee
{
	private int id;
	private String name;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
		//System.out.println("Emp 2 args constructor");
	}
	
	//void setDetails()
	abstract void getSalary();
	void printDetails()
	{
		System.out.print(this.id+", ");
		System.out.print(this.name+", ");
	}
} 
class RegularEmployee extends Employee
{
	private double basicpay;
	private double salary;
	RegularEmployee(int id, String name, double basicpay)
	{
		super(id,name);
		this.basicpay = basicpay;
	}
	void getSalary()
	{
		salary = basicpay * 1.7;	//17 percent
		//System.out.println(salary);
		printDetails();
	}
	void printDetails()
	{
		super.printDetails();
		//System.out.println("id= ");
		//System.out.println("Name= ");
		System.out.print(salary+"\n");
	}
	
}
abstract class ContractBasedEmployee extends Employee
{
	private int noOfYears;
	ContractBasedEmployee(int id, String name, int noOfYears)
	{
		super(id,name);
		this.noOfYears = noOfYears;
	}
	public void getNoOfYears()
	{
		super.printDetails();
		System.out.print(this.noOfYears+", ");
	}
}
class CdacContractBasedEmp extends ContractBasedEmployee
{
	private double consolidatedSal;
	CdacContractBasedEmp(int id, String name, int noOfYears, double consolidatedSal)
	{
		super(id,name,noOfYears);
		this.consolidatedSal = consolidatedSal;
	}
	public void getSalary()
	{
		System.out.println(consolidatedSal);
	}
	public void printDetails()
	{
		getNoOfYears();
		getSalary();
	}
	
}
class ThirdPartyEmp extends ContractBasedEmployee
{
	private double salary;
	//int years;
	ThirdPartyEmp(int id, String name, int years, double salary)
	{
		super(id,name,years);
		this.salary = salary;
	}
	public void getSalary()
	{
		System.out.println(salary);
	}
	void printDetails()
	{
		getNoOfYears();
		getSalary();
	}
	
}
class EmployeeMain
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		RegularEmployee r1 = new RegularEmployee(1, "Renuka" , 30000.0);
		r1.getSalary();
		//r1.printDetails();
		CdacContractBasedEmp contract = new CdacContractBasedEmp(001, "Mayuri", 2, 120000);
		contract.printDetails();
		
		ThirdPartyEmp t1 = new ThirdPartyEmp(00, "Skashi", 5, 200000);
		t1.printDetails();
	}
}

/*
int mainId,mainYears;
		String mainName;
		double mainSalary;
		System.out.print("Enter Id-> ");
		mainId = sc.nextInt();
		System.out.print("\nEnter Name-> ");
		mainName = sc.nextLine();
		sc.nextLine();
		System.out.print("\nEnter Years-> ");
		mainYears = sc.nextInt();
		System.out.print("\nEnter -> ");
		mainSalary = sc.nextDouble();
*/