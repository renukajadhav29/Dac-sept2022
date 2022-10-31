import java.util.Scanner;
class ReverseStringRec
{
	static String reverseString(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		else
		{
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(reverseString(str));
		//System.out.println(str.substring(1));
	}
}