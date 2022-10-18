class StringHandling
{
	public static void main(String args[])
	{
		String s1 = "Welcome";
		String s2 = new String("Welcome");
		String s3 = "Welcome";
		String s4 = new String("Welcome");
		
		
		//----------shallow Comparison------------------
		System.out.println("s1 == s2 returns=> "+ (s1 == s2));	//false
		System.out.println("s1 == s3 returns=> "+ (s1 == s3));	//true
		System.out.println("s3 == s4 returns=> "+ (s3 == s4));	//false
		
		//-----------Deep Comparison--------------------
		System.out.println("s1.equals(s2) =>"+ s1.equals(s2));	//true
		System.out.println("s1.equals(s3) =>"+ s1.equals(s3));	//true
		System.out.println("s3.equals(s4) =>"+ s3.equals(s4));	//true
		
		Integer i1 = 100;
		Integer i2 = 100;//constant pool
		
		Integer ii1 = new Integer(100);
		Integer ii2 = new Integer(100);
		
	}
}
/*
-> String are basically sequence of characters.
-> String literals are kept always inside double quote. eg. "Hello", "Welcome" etc..

String s1 = "Welcome";
String s2 = new String("Welcome");

System.out.println(s1);
System.out.println(s2);

String Constant pool=>
-------------------
String s1 = "Welcome";//Occupies memory in constant pool.

String s2 = new String("Welcome");//occupies memory in heap area.

String s3 = "Welcome";
String s4 = new String("Welcome");

In constant pool, there isno duplicate String but in heap there can be duplicate String.
Each time we use new Creating string object, fresh memory space will be occupied in the heap.

String class overridesthe equals method and does the deep comparison.

s1.equals(s3); //true
s2.equals(s4);//true
s1.equals(s2); //true 

*/