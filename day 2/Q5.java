import java.util.Scanner;

class Q5{
	
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number of days for Normal year");
	
	int days = sc.nextInt();
	
	int year = days/365 ; //return year 
	
	int Rday = days%365 ; // return remaing days
	
	int months = Rday/30; // return months
	
	int Aday= Rday%30; // returns actual days
	
	// System.out.println("Year : " + year+" "+ Rday + " " + months+" "+Aday);
	
	System.out.println("Year : " + year+" " + " Months" + months +" Days"+ Aday);
	
}
}
	