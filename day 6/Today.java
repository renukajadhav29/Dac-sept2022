class Today
{
	public static void main(String args[])
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
		}//infinite loop
		
		while(i<=10)
		{
			System.out.println(i++);
		}//it will print 1 to 10
		
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}//it will print 1 to 10
		
		/*
		In while loop first condition is checked and then
		controle comes inside the loop
		
		in do while loop condition is always checked at the last.
		so the do while loop will definitely execute at least once.
		
		*/
		int d1=1;
		do 
		{
			System.out.println(d1);
			d1++;
		}while(d1<=10); //print upto 10
		
		for(int j=1;j<=10;j++)
		{
			System.out.println(j);
		}
		/*
		break: takes the control out of the loop
		continue: it will skip to execute the further statements inside loop
		and takes the control at the start of the loop
		*/
		int w=1; 
		while(w <= 10)
		{
			System.out.println(i);
			if(w==5)
			{
				break;
			}
			w++;
		}
		
		int w2=1
		while(w2<=10)
		{
			if(w2 ==5 )
			{
				continue;
			}
			System.out.println(w2);
			w2++;
		}//print till 4 after that it will go in infinite loop
		
		
		int w2=1
		while(w2<=10)
		{
			if(w2 ==5 )
			{
				w2++
				continue;
			}
			System.out.println(w2);
			
		}//it will print 1 to 10 accept 5
	===============================================
		int a=5;
		block1: {
			System.out.println("hello");
			
			block2: {
				System.out.println("hi");
				if(a==5)
					break block2;
				
				System.out.println("I am here");//control will skip this line due to break
			}
			
			System.out.println("Out of block 2");
			
		}
		
		System.out.println("Out of block 1");
		System.out.println("Bye");
		
		/*
		
		*/
	================================================
	}
}

===============================================================
Arrays in java:=>
------------------
Array is collection of similar type of data.
eg: Storing Students marks 40,60,70,69
new Operator is used to allocate memory for array.
new int[5];
