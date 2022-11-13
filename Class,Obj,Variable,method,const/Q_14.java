class Q_14
{
	int a,b,sum;
	
	void add(int a,int b)
	{
		sum=a+b;
		System.out.println(a+" + "+b+" = "+sum);
	}
	
	
	public static void main(String[] args)
	{
		Q_14 m=new Q_14();
		m.add(10,20);
	}
}