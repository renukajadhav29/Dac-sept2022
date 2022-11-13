class Q_15
{
	public static void main(String args[]) 
	{
		String a = "Hello";
		String b = "Hello";
		  
		
		System.out.println("HashCode of a = "+a+" : "+a.hashCode());
		System.out.println("HashCode of b = "+b+" : "+b.hashCode());

		if(a.equals(b))
		{
			System.out.println(" a & b hashcode is same ");
		}

		String c = "hello";
		
		if(a.equals(c))
			System.out.println(" a & c hashcode is same ");
		else
			System.out.println(" a & c hashcode is Different ");
		
		System.out.println("HashCode of c = "+c+" : "+c.hashCode());

		System.out.println("HashCode of a = "+a+" : "+a.hashCode());
	}
}