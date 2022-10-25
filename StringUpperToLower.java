import java.util.*;
class StringUpperToLower 
{
	static void convertString(StringBuffer str)
	{
		int length = str.length();
		
		for(int i = 0; i<length; i++)
		{
			Character c = str.charAt(i);
			if(Character.isLowerCase(c))
			{
				str.replace(i,i+1,Character.toUpperCase(c)+"");
			}
			else
			{
				str.replace(i,i+1,Character.toLowerCase(c)+"");
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer str = new StringBuffer(s);
		
		convertString(str);
		System.out.println(str);
	}
}