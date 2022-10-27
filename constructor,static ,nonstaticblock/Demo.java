import java.util.Scanner;
class Student{
	
	int roll;
	double marks;
	
	Student()
	{
		roll=1;
		marks=1;
	}
	Student(int roll,double marks)
	{
		this.roll=roll;
		this.marks=marks;
	}
	void printDetails(){
		System.out.println(roll+","+marks);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total Number of student->");
		int size=sc.nextInt();
		
		Student s1[]=new Student[size];
		System.out.println("Please enter details of the Students");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter roll & marks");
			int r=sc.nextInt();
			double m=sc.nextDouble();
			s1[i]=new Student(r,m);
		}
		System.out.println("Entered All details are:=> ");
		for(int i=0;i<size;i++)
		{
			s1[i].printDetails();
		}
	}
}
/*
Array of objects:=>
int myarr[]=new int[5];
Student s[]=new Student[5];
THe above line will never create 5  Student Objects.
It is basically creating an array of Student references which will be used to store 
5 Student object reference.*/

