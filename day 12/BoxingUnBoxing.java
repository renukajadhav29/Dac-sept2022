class BoxingUnBoxing
{
	static int fun(Integer v)
	{
		return v;
	}
	public static void main(String args[])
	{
		Integer iob = fun(100);
		System.out.println(iob);
	}
}


/*Storing primitive data into Wrapper object is Boxing
Getting primitive data from the Wrapper object is unboxing

Integer obj = new Integer(10);	//Boxing
int val = obj1.intValue()//unboxing


Atoboxing and Auto-unboxing=>
Integer obj1 = 10;		//Autoboxing; Internally=> Integer obj1 = new Integer(10)
int val = obj1; 		//Auto-unboxing; Internally=> int val = obj1.intValue();


Integer = int;
int = Integer;

Both types are compatible with each other due to autoboxing and auto-unboxing

==============================================================


Some arithmetic operations with wrapper class objects=>

Integer obj = 10;
obj++;

int i = 0;
i++

int x = 5;
int y = 10;
int z = x + y;

Integer iobj = 5;
int a= 10;
int res = iobj + a;		//ok


Charecter ch = 'x';//box
char ch2 = ch;//unbox



Boolean b = true;
if(b){....}

*/