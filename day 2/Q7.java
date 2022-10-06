
import java.util.Scanner;

class Q7{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println( "Enter value for varibale A : ");
		
		int A = sc.nextInt();
		
		System.out.println( "Enter value for varibale B : ");
		
		int B =sc.nextInt();
		
		System.out.println( "Value for varibale A before Swap : "+A+ " \n Value for varibale B before Swap : "+B);
		
		A = A+B ;
		
		B = A-B ;
		
		A= A-B ;
		
		System.out.println( "Value for varibale A After Swap : "+A+ " \n Value for varibale B After Swap : "+B);


	}
}
 
