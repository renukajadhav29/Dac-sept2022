class Box
{
	int height,width,breadth;
	double v,a;
	Box()
	{
		height=100;
		width=150;
		breadth=180;
	}
	/*void findVolume(int h,int w,int b)
	{
		v=(double)(h*w*b);
		System.out.print("Volume of a Box= "+v+"\n");
	}*/
	
	void findVolume()
	{
		v=(double)(height*width*breadth);
		System.out.print("Volume of a Box= "+v+"\n");
	}
	
	
	void findArea(int w,int b)
	{
		a=(double)(w*b);
		System.out.print("Area of a Box= "+a);
	}
}
class Q_6
{
	public static void main(String args[])
	{
		Box b1=new Box();
		//b1.findVolume(b1.height,b1.width,b1.breadth);
		
		b1.findVolume();
		
		b1.findArea(b1.width,b1.breadth);
	}
}