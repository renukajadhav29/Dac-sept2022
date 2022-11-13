public class Q_10
{
	public static void main(String args[])
	{
		InnerClass i1 = new InnerClass("Renuka");
		InnerClass i2 = new InnerClass("Jadhav");
		
		objectWrapper obj1 = new objectWrapper(i1);
		objectWrapper obj2 = new objectWrapper(i2);		
		
		System.out.println("Before swaping : \nI1.name : "+obj1.wrapperobj.name+" I2.name : "+obj2.wrapperobj.name+"\n");
		
		swapObj(obj1,obj2);
		System.out.println("After Swaping : \nI1.name : "+obj1.wrapperobj.name+" I2.name : "+obj2.wrapperobj.name);
	}
	
	static void swapObj(objectWrapper a1,objectWrapper a2)
		{
			InnerClass temp =a1.wrapperobj;
			a1.wrapperobj = a2.wrapperobj;
			a2.wrapperobj = temp;
		}
	
	public static class InnerClass
	{
		String name;
		
		InnerClass(String name)
		{
			this.name = name;
		}
	}
	
	public static class objectWrapper
	{
		InnerClass wrapperobj;
		objectWrapper(InnerClass obj)
		{
			this.wrapperobj = obj;
		}
	}
}