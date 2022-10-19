class Room
{
	int height,width,breadth;
	void volume(int h,int w,int b)
	{
		System.out.println("Volume of a room is=> "+(h*w*b));
	}
}
class Q_4
{
	public static void main(String args[])
	{
		Room r1=new Room();
		r1.height=200;
		r1.width=200;
		r1.breadth=200;
		r1.volume(r1.height,r1.width,r1.breadth);
		
	}
}