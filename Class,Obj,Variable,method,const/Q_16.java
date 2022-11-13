//Java Program to Illustrate Use of Final Keyword
import java.util.Scanner;
class Shape
{
    int radius;
    Shape(int radius)
    {
        this.radius = radius;
    }
    final double pie = 3.14;
}
class Circle extends Shape
{
    Circle(int radius)
    {
        super(radius);
    }
    void findAread()
    {
        System.out.println("Area of a Circle : "+(pie*radius*radius));
    }
}
public class Q_16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle : ");
        int r = sc.nextInt();
        Circle c1 = new Circle(r);
        c1.findAread();
    }
}