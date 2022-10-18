class A
{
	private int a;
	A(){
		System.out.println("A zero args const");
	}
	
	A(int a)
	{
		System.out.println("A one args const");
		this.a = a;
	}
	
	void setA(int a)
	{
		this.a = a;
	}
	/*int getA()
	{
		return this.a;
	}*/
	void getA(){
		
		System.out.println("a=> "+this.a);
	}
}
class B extends A 
{
	int b;
	
	B(){
		System.out.println("B zero args const");
	}
	
	B(int a, int b)
	{
		super(a);
		this.b = b;
		System.out.println("B two args const");
	}
	
}
class C extends B 
{
	int c;
	C()
	{}
	C(int a, int b, int c)
	{
		super(a,b);
		setA(a);
		this.b=b;
		this.c=c;
		System.out.println("C three args const");
	}
	void display()
	{
		getA();
		//System.out.println("a="+getA());
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}
class PrivateAccess
{
	public static void main(String args[])
	{
		C c1 = new C(5, 6, 7);
		c1.display();
	}
}