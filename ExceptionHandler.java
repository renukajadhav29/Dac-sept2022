import java.util.*;
class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}
class StringParsedException extends Exception
{
	StringParsedException(String s)
	{
		super(s);
	}
}

class ExceptionHandler
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();

			if(n2 == 0)
			{
				throw new MyException("Invalid Division");
			}
			else
			{
				System.out.println("Result of Division = "+n1/n2);
			}
		}
		catch(MyException me)
		{
			System.out.println(me.getMessage());
		}
		finally
		{
			System.out.println("Exception Handling Completed");
		}
	}
}