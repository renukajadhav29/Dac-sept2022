import java.util.*;
class RemovePunctuations
{
	static String removePunct1(String str,int a)
	{
		if(a==str.length())
		{
			return "";
		}
		if(!((str.charAt(a)>64 && str.charAt(a)<91) || (str.charAt(a)>96 && str.charAt(a)<123) || str.charAt(a)==32))
		{
			return removePunct1(str,++a);
		}

		return str.charAt(a)+removePunct1(str,++a);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str=removePunct1(str,0);
		System.out.println(str);
	}
}
/*

[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]

97-123
65-91


import java.util.Scanner;
class RemovePunctuations
{
	static removeSymbol(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i) != !) || (str.charAt(i) != \) || (str.charAt(i) != ") || (str.charAt(i) != #) || (str.charAt(i) != $) || (str.charAt(i) != %) || (str.charAt(i) != &) || (str.charAt(i) != ') || (str.charAt(i) != () || ) || * || + || , || - || . || / || : || ; || < || = || > || ? || @ || \ || \ || [ || \ || \ || ] || ^ || _ || `|| { || | || } || ~ || )
			{
				System.out.print(str.charAt(i));
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		removeSymbol(str);
	}
}

*/