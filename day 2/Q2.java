import java.util.*;

class Q2
{
public static void main(String[] args)
{
	System.out.println("Enter the Radius in meters");
	Scanner sc= new Scanner(System.in);
	float radius = sc.nextFloat();
	
	final float pie = 3.14f;
	
	float circumOfcircle = (pie * 2 * radius);
	
	System.out.println("Circumfarence of circle is : "+circumOfcircle+" sq.mtr");
}
}
