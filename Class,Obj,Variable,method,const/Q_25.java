class Q_25
{
	static
	{
		System.out.println("Static block called");
	}
	static void display()
	{
		System.out.println("Static method called");
	}
	public static void main(String args[])
	{
		
		display();
	}
}
/*
output:->
Static block called
Static method called
*/