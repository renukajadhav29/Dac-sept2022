import java.util.Scanner;
class Q_1
{
	
	static boolean isPalindrom(String s)
	{
		String original = "";
		String reverse = "";
		
		for(int i = 0; i<s.length(); i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				original = original+s.charAt(i);
			}
			else
				continue;
		}
		
		for(int i=(original.length()-1);i>=0;i--)
		{
			reverse = reverse+original.charAt(i);
		}
		
		if(original.equalsIgnoreCase(reverse))
			return true;
		else
			return false;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isPalindrom(str));
	}
}