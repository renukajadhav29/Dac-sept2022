class StaticNonStatic
{
	int a;
	int b;
	static int c;
	
	//Static block
	static
	{
		c=4;
		System.out.println("Inside Static block");
		// Only static method and data can be accessed
	}
	
	//Non-static block
	{
		a=1;
		b=2;
		System.out.println("Inside Non-Static block");
		//Static as well as non-static method and data can be access.
	}
	StaticNonStatic()
	{
		System.out.println("Inside Class Constructor");
	}
	public static void myFun()
	{
		System.out.println("Inside Static method myFun() \n c=>"+c);
	}
	void print()
	{
		System.out.println(a+" "+b);
	}
}
class StaticBlock
{
	public static void main(String args[])
	{
		StaticNonStatic sn=new StaticNonStatic();	// static block non-static ,constructor are executed.
		sn.print();
		StaticNonStatic sn1=new StaticNonStatic();	//only non-static block executed now as static block is execuetd only once as previous statement executes static block	
		sn1.print();
		//StaticNonStatic.myFun();//only static block get called non static block will not be executed.
	}
}
/*
--Inside a class static and non-static block can be created.
--static block can be used to initialize the static data/class Variable.
--Static block gets executed when the class is loaded first time in memory, so static block is executed only once and it does not matter how many objects created
--Non-static block can be used to initialize the non-static data/instance variable. 
Non-static block are also known as init or initializer block.
-- Before the constructor execution/calling, if some pretask(like initialization of instance variablrs and other things)
is to be done with the object,it can be done in the non-static block

==>> Order of Execution: First static block is executes (but only)==========???????????

example of static and non-static block:=>
	//Static block
	static
	{
		
	}
	
	//Non-static
	{
		
	}
	
	
-- Non-static block are always executed before the constructor.
--Non-static block will only be executed when any object is created. Every time 
whenever we create object 





class Demo
{
	static
	{
		System.out.println("Static block 1");
	}
	
	//non-static
	{
		System.out.println("Non Static block 1");
	}
	
	static
	{
		System.out.println("Static block 2");
	}
	
	//non-Static
	{
		System.out.println("Non-Static block 2");
	}
}
class DemoStaticNonStatic
{
	public static void main(String args[])
	{
		//Demo d1=new Demo();
		new Demo();
	}
}

OUTPUT:=>
Static block 1
Static block 2
Non Static block 1
Non-Static block 2
==============================================
class First{
	void fun()
	{
		
	}
}
class Main{
	static 
	{
		First f1=new First();
		f1.fun();
	}
}

--If threr are multiple static / non-static block inside a class ,then these  blocks will be executed in order of
their block sequence inside the class.

--For static block same rule applied as it is applied for static method.
*/