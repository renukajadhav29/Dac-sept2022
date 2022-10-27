class Reference
{
	int a;
	int b;
	Reference()
	{
		a=0;
		b=0;
	}
	Reference(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void increament(int x, int y)
	{
		x++;
		y++;
	}
	void change(Reference r)
	{
		r.a=r.a+1;
		r.b=r.b+1;
		//r.a=r.a + this.a;
		//r.b=r.b + this.b;
	}
	void print()
	{
		System.out.println("A=> "+a+" B=> "+b);
	}
}
public class ReferenceMain{
	public static void main(String args[])
	{
		Reference r1=new Reference(5,10);
		int x = 2;
		int y = 4;
		System.out.println("Before Call by value");
		r1.print();
		r1.increament(x,y);		//call by value
		System.out.println("After call by value ");
		r1.print();
		
		
		//Reference rr=new Reference(20,30);
		Reference r2=new Reference(20,30);
		System.out.println("Before call by Reference=>  ");
		r2.print();
		r1.change(r2);			//call by reference
		System.out.println("After call by Reference=>");
		r2.print();
		
	}
}

/*
All primitive data are passed by value.
All non-primitive (objects) are passed by reference but that reference is also passed by value.






/*
Studen s;
s.printDetais();  // runbtime error : Null pointer exception.

*/

*/