import java.util.Scanner;
class Q_26
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Byte a,b;
		
		System.out.println("Enter two values : ");
		a = sc.nextByte();
		b = sc.nextByte();
		byte c = (byte)(a+b);
		System.out.println("Sum of two byte values are : "+c);
	}
}