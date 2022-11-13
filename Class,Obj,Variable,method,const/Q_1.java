abstract class Vehicles
{
	int number;
	String name;
	Vehicles()
	{	}
	Vehicles(String name,int number)
	{
		this.name = name;
		this.number = number;
	}
}
class FourWheeler extends Vehicles
{
	double weight;
	String brand;
	
	FourWheeler(String name,int number,double weight, String brand)
	{
		super(name,number);
		this.weight = weight;
		this.brand = brand;
	}
	void display()
	{
		System.out.println("Name -> "+name);
		System.out.println("Number -> "+number);
		System.out.println("weight -> "+weight);
		System.out.println("Brand -> "+brand);
	}
}
class Q_1
{
	public static void main(String args[])
	{
		FourWheeler fw = new FourWheeler("Car",1423,950.5,"TATA");
		fw.display();
	}
}