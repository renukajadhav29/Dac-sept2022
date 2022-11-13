//Java Program to Demonstrate Usage of an Instance Variable in the Test Class
class TestQ_23
{
	int id,age;
	String name;
	void setValues(int id1,String name1,int age1)
	{
		id = id1;
		name = name1;
		age = age1;
	}
	
	void getValues()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
	public static void main(String args[])
	{
		TestQ_23 t1 = new TestQ_23();
		t1.setValues(1,"Renuka Jadhav", 22);
		t1.getValues();
	}
}