import java.util.Scanner;

class Q4 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the principle ammount");
		
		Scanner sc = new Scanner( System.in);
		
		long principleamount = sc.nextLong();
		
		System.out.println("Enter the Interest Rate");
		
		float interestrate = sc.nextFloat();
		
		System.out.println("Enter the Period");
		
		int year = sc.nextInt();
		
		float newamount = ( (float) (principleamount *interestrate * year ) )/ 100 ;
		
		System.out.println("Simple Interest ammount to pay is : " +newamount);
		
		float totalammount = principleamount+ newamount ;
		
		System.out.println("Total ammount to pay is : " + totalammount);
		
	}
}
		
		