import java.util.Scanner;
class Armstrong{
	public static void main(String args[])
	{
		int r,sum=0;
		int count=0;
		int multiply,result=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		while(num>0){
			r=num%10;
			sum=10*sum+r;
			num=num/10;
			count++;
		}
		num=sum;
		//System.out.println(count);
		while(num>0)
		{
			r=num%10;
			sum=10*sum+r;
			//System.out.println(r);
			num=num/10;
			multiply=1;
			for(int i=1;i<=count;i++)
			{
				multiply=multiply*r;
				
			}
			result=result+multiply;
			
		}
		if(result == temp)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
		
	}
}