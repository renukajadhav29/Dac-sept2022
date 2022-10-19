class ComplexNumber
{
	int real,imag;
	ComplexNumber(){
		real = 0;
		imag = 0;
		System.out.println(real+" + "+imag+"i");
	}
	ComplexNumber(int real)
	{	
		this.real = real;
		System.out.println(real+" + "+this.imag+"i");
	}
	ComplexNumber(int real, int imag)
	{
		this.real = real;
		this.imag = imag;
		System.out.println(real+" + "+imag+"i");
	}
	void main(int n1,int n2,int n3)
	{
		System.out.println(n1+" + "+n2+"i");
		System.out.println(n3+" - "+n2+"i");
	}
	public static void main(String args[])
	{
		int n1=3;
		int n2=2;
		int n3=4;
		ComplexNumber c1 = new ComplexNumber();
		ComplexNumber c2 = new ComplexNumber(2);
		ComplexNumber c3 = new ComplexNumber(3,4);
		
		System.out.println("Created main() method:-> ");
		c1.main(n1,n2,n3);
		
	}
}