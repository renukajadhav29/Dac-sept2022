//Java Program to Demonstrate Usage of a Static Variable in the Test Class
class TestQ_24
{
	static int var = 17;
	public static void main(String args[])
	{
		System.out.println(var);//No need to create object to access var
		System.out.println(TestQ_24.var);//We can access var by using classname
	}
}