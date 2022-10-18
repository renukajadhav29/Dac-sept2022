class A{
	private int a;
	public void fun1()
	{
		System.out.println(a);
	}	
}
class B extends A{
	int b;
}
class C extends B{
	
	int c;
	C()
	{
		
	}
	C(int a, int b, int c)
	{
		this.b=b;
		this.c=c;
	}
	public void fun()
	{
		
	}
}

class Main1
{
	public static void main(String args[])
	{
		C c1 = new C(2,4,5);
		//A a1 = new A();
		c1.fun1();
	}
}