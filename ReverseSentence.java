import java.util.Scanner;
class ReverseSentence
{
	static String reverseStatement(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		else
		{
			return reverseStatement(str.substring(1)) + str.charAt(0);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverseStatement(str));
	}
}