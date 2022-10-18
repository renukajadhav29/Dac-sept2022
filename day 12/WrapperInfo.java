/*new Integer(5)			//return Integer object
Integer.valueOf("5");	//return Integer object

Integer.parseInt("5");		//Conver String numeric to int primitive

toString();		//returns String representation of number
intValue();		//returns int primitive from Integer object

Charecter obj = new Character('A');
Charecter.isDigit('A');//false
Charecter.isDigit('9');//true

------------------------------------------------
Integer and Long class have following static methods.

-toBinaryString();
-toHexString();
-toOctalString();

eg:-
Integer.toBinaryString(5);	//print 101
Integer.toHexString(31)


*/

class WrapperInfo
{
	public static void main(String args[])
	{
		int num = 34;
		int num1 = 31;
		
		String  bin = Integer.toBinaryString(num);
		System.out.println(bin);	//100010
		
		String oct = Integer.toOctalString(num1);//
		String hex = Integer.toHexString(num1);
		System.out.println(oct);//37
		
		System.out.println(hex);//1f
	}
}