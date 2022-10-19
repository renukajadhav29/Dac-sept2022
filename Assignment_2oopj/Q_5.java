class Student
{
	String name;
	int m1,m2,m3;
	double avg;
	void setValue(int m1,int m2, int m3, String name)
	{
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void average()
	{
		avg=(double)((m1+m2+m3)/3);
		System.out.println("Average=> "+avg);
	}
	void display()
	{
		System.out.println("Name of Student=> "+name);
		System.out.println("Marks of 3 Subjects => "+m1+" "+m2+" "+m3);
		System.out.println("Average marks=> "+avg);
		
	}
}
class Q_5
{
	public static void main(String  args[])
	{
		Student s1=new Student();
		s1.setValue(70,80,75,"Renuka");
		s1.average();
		s1.display();
	}
}