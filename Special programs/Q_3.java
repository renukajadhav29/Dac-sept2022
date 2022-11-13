import java.util.Scanner;
class Q_3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int L=0;
		int R=0;
		int U=0;
		int D=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == 'L')
				L++;
			else if(str.charAt(i) == 'R')
				R++;
			else if(str.charAt(i) == 'U')
				U++;
			else if(str.charAt(i) == 'D')
				D++;
		}
		
		if(L == R && U == D)
			System.out.println("true");
		else
			System.out.println("false");
	}
}