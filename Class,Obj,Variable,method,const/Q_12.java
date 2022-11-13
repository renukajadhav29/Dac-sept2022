import java.util.Scanner;
class Q_12
{
	static Scanner sc = new Scanner(System.in);
	static int side;
	static int areaOfSquare()
	{
		System.out.println("Enter the side of square : ");
		side = sc.nextInt();
		return side*side;
	}
	public static void main(String args[])
	{
		System.out.println(areaOfSquare());
	}
}