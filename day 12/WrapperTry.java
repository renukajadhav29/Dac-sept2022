class WrapperDemo
{
	public static void main(String args[])
	{
		//Double d = new Double(53.7);//not working
		//Double d = new Double("53.7");//not working
		Double d = Double.valueOf("60.7");	//Double obj to primitive double
		
		Double d2 = Double.valueOf("60.7");
		
		Double d3 = Double.valueOf("66.7");
		Double d4 = Double.valueOf("64.7");
		
		double dp = Double.parseDouble("55.7");
		System.out.println(d);
		System.out.println(dp);
		//Double dobj1 = new Double("53.5");//not working
		//System.out.println(dobj1)
		int ip = Integer.parseInt("233");
		
		String s = d.toString();//returns String representation of the double
		System.out.println(d.toString());
		System.out.println(s);
		
		int res1 = d.compareTo(d2);
		System.out.println("result1=> "+res1);//print 0
		
		int res2 = d2.compareTo(d3);
		System.out.println("result2=> "+res2);// print -1
		
		int res3 = d3.compareTo(d4);
		System.out.println("result3=> "+res3);//print 1
		
		
		Double dp0 = Double.valueOf("56.666");
		System.out.println("dp0=>  "+dp0);
		
		double dp1 = d4.doubleValue();
		System.out.println("double dp1=> "+dp1);//64.7
		
		byte bp = d4.byteValue();//
		System.out.println("byte bp=> "+bp);//64
		
		//Integer i1 = new Integer("111"); // Warning
		//Integer i2 = new Integer("222");//warning: [removal] Integer(String) in Integer has been deprecated and marked for removal
		
		System.out.println("i1=>  "+i1);
		
		Boolean bool1 = new Boolean("true");
		Boolean bool2 = Boolean.valueOf("true");
		bool1.toString();
	}
}

/*
Wrapper Classes:->
eight primitive types:
byte, short, int, long, float, double, char, boolean


Some classes in java works only with Objects or we can say at some places we must have objects to do the
operations. In such scenario, wrapper class plays a major role. In the collection framework and in generics, 
only object is requires there to do any operation. These can not work with primitive type.


Wrapper classes are basically used to wrap the primitive type into objects.
Wrapper classes:
Byte
Short
Integer
Long
Float
Double
Character
Boolean


** Number  is the superclass of all the wrapper classes and it is an abstract 

Double d = new Double(33.5);
Double d = new Double("33.5");



int compareTo(Boolean obj)
static boolean parseBoolean(String str)
String toString()
*/