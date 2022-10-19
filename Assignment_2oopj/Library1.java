import java.util.*;
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
		System.out.println("----------------------------------");
	}
}
	
public class Library1
{
	public static void display(List<Book> b1){
		int num=1;
		for(Book b : b1)
		{
			System.out.println("Book "+num);
			b.printDetails();
			num++;
		}
	}
	public static void main (String args[])
	{
		List<Book> book = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.print("1. Add Book\n 2. Display Info\n 3. Delete a Book\n 4. Exit \n ENter your choice -> ");
			choice = sc.nextInt();
			sc.nextLine();
			
		switch(choice)
		{
			case 1:
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
				
				book.add(new Book(T1,A1,pub1,P1,pr1));
				System.out.println("Book is Added...");
				break;
			case 2:
				display(book);
				break;
			
			case 3:
				System.out.println("Enter the Book number to remove :-> ");
				int n = sc.nextInt();
				//Book b = book;
				book.remove(n-1);
				System.out.println("Book "+n+" deleted successfully");
				break;
			case 4:
				System.out.println("Thank you...");
				break;
			default:
			{
				System.out.println("Enter proper choice... ");
			}
				
		}}while(choice!=4);
		
	}
}