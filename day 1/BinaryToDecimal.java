//import java.lang.Math;
import java.util.*;
class BinaryToDecimal
{
	/*public static void main(String args[])
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Binary Number:-");
		int num=sc.nextInt();
		int decimal=0;
		int n=0
		int temp=num;
		
		
	}*/
	
	public static void main(String args[])
	{  
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int decimal=Integer.parseInt(str,2);  
		System.out.println(decimal);  
	}
}