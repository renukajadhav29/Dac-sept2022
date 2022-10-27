/* Constructor chaining*/
class Constructor1
{
	int a;
	int b;
	int c;
	Constructor1(){
		a=0;
		b=0;
		c=0;
	}
	Constructor1(int a)
	{
		//System.out.println("One args constructor");
		this();	
		System.out.println("One args constructor");		//calling zero argument constructor;
		this.a=a;
	}
	Constructor1(int a,int b)
	{
		this(a);
		System.out.println("Two args constructor");		//calling one argument constructor with value of a;
		this.b=b;
	}
	Constructor1(int a,int b,int c)
	{
		this(a,b);			//calling two argument constructor with value a and b;
		System.out.println("One args constructor");		
		this.c = c;
	}
	void myFun()
	{
		//this(5,6,7);		//Error not allowed
	}
	void print()
	{
		System.out.println("a="+a+". b="+b+", c="+c);
	}
}
class ConstructorDemo
{
	public static void main(String args[])
	{
		Constructor1 d=new Constructor1();
		Constructor1 c1=new Constructor1(5,10,15);
		d.print();
	}
}
/*
-- We can call overloaded constructor from another constructor of the same class using
"this".
-- We can not call constructor using "this" from any other methods except constructor method.
-- Constructor calling using "this" should always be the very first line  inside the constructor

-- If using "this" we trying to call any other method, then it is not mandatory to keep it as first
statement. only constructor calling using "this" should be the first statement
*/