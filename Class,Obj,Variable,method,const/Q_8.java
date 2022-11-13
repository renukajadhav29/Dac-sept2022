class Target
{
	static int count=0;
	
	{
		count++;
	}
	void numOfObj()
	{
		System.out.println("Number of object of class Target created is :-> "+count);
	}
}
class Q_8
{
	public static void main(String args[])
	{
		Target t1 = new Target();
		Target t2 = new Target();
		Target t3 = new Target();
		Target t4 = new Target();
		Target t5 = new Target();
		Target t6 = new Target();
		Target t7 = new Target();
		t1.numOfObj();
	}
}