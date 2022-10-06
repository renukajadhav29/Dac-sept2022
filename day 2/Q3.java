import java.util.Scanner;

class Q3{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter marks for English");
	
	int English = sc.nextInt();
	
	int Mathematics = sc.nextInt();
	
	int Science = sc.nextInt();
	
	int Geography = sc.nextInt();
	
	int History = sc.nextInt();
	
	int sum = English + Mathematics + Science + Geography + History ;
	
	float percentage = ((float)sum/500)*100;
	
	System.out.println("Percentage : " + (int)percentage);
}
}
	
	
	