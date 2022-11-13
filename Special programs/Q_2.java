import java.util.Scanner;
class Q_2
{
	static boolean isCapital(String str)
	{
		String substring = str.substring(1);
		int lengthofsub = substring.length();
		int flag;
		
		if(Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(substring.charAt(0)))
		{
			flag = 0;
			for(int i=1;i<lengthofsub;i++)
			{
				if(Character.isUpperCase(substring.charAt(i)))
				{
					flag++;
				}
			}
			
			if(flag == (lengthofsub-1))
			{
				return true;
			}
			
		}
		
		else if(Character.isLowerCase(str.charAt(0)) && Character.isLowerCase(substring.charAt(0)))
		{
			flag = 0;
			for(int i=1;i<lengthofsub;i++)
			{
				if(Character.isLowerCase(substring.charAt(i)))
				{
					flag++;
				}
			}
			
			if(flag == (lengthofsub-1))
			{
				return true;
			}
			
		}
		
		else if(Character.isUpperCase(str.charAt(0)) && Character.isLowerCase(substring.charAt(0)))
		{
			flag = 0;
			
			for(int i=1;i<lengthofsub;i++)
			{
				if(Character.isLowerCase(substring.charAt(i)))
					flag++;
			}
			if(flag == (lengthofsub-1))
				return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(isCapital(str));
		
	}
}