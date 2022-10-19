import java.util.Scanner;

class Book
	{
		String title,author,publisher;
		int pages;
		float price;
		
		Book (String T, String A, String P, int p, float pr )
		{
			author =A;
			title=T;
			publisher= P;
			pages= p;
			price= pr;
		}
	
	void printDetails()
	{
		System.out.println("Title: "+title );
		System.out.println("Author: "+author);
		System.out.println("Publisher: "+publisher);
		System.out.println("Pages: "+pages );
		System.out.println("Price: "+ price );
		
	}
}
	
public class Library
{
	public static void main (String args[])
	{  
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		//Book b1=new Book();
		sc.nextLine();
		Book B1[]= new Book[size];
		
		//System.out.println("MESSAGE");
		for( int i =0; i<size ; i++)
		{
			System.out.println("ENTER TITLE");
			String T1 = sc.nextLine();
				
			System.out.println("ENTER AUTHOR");
			String A1 = sc.nextLine();
				
			System.out.println("ENTER PUBLISHER");
			String pub1 = sc.nextLine();
				
			System.out.println("ENTER PAGES");
			int P1 = sc.nextInt();
				
			System.out.println("ENTER PRICE");
			float pr1 = sc.nextFloat();
			sc.nextLine();
			
			B1[i] = new Book(T1,A1,pub1,P1,pr1);
		}
		for( int j =0; j<size ; j++)
		{
			System.out.println("=========================================");
			B1[j].printDetails();
			System.out.println("=========================================");
		}
	}
}