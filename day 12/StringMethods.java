class StringMethods
{
	public static void main(String args[])
	{
		String s1 = "Welcome";
		String s2 = new String("Welcome");
		String s3 = "Welcome";
		String s4 = new String("Welcome");
		
		System.out.println("s1.charAt(0) => "+s1.charAt(0));
		char chr[] = new char[10];
		s1.getChars(2,5,chr,2);
		for(int i = 0; i < chr.length; i++)
		{
			System.out.print(chr[i]);
		}
		System.out.println();
		//-------------------------------
		
		/*s1.getChars(2,5,chr,2);
		for(int i = 0; i < chr.length; i++)
		{
			System.out.println(chr[i]);
		}
		*/
		
		byte [] b = s1.getBytes();	//returns ascii values of string
		
		/*for(int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}*/
		for(byte x:b)
		{
			System.out.println(x);
		}
		
		System.out.println();
		//--------------equals ignore -------------
		
		String s5 = "WElcoMe";
		String s6 = "welComE";
		System.out.println("s5.equals(s6)=> "+s5.equals(s6));	//false
		System.out.println("s5.equalsIgnoreCase(s6)=> "+s5.equalsIgnoreCase(s6));	//true
		
		//-----------------------------toCharArray()---------------------------------
		
		//s1.toCharArray();
		System.out.println("=====toCharArray() Method======");
		
		char ss[] = s1.toCharArray();
		for(int i=0;i<ss.length;i++)
		{
			System.out.print(ss[i]+"  ");
		}
		System.out.println();
		System.out.println("=====compareTo() Method======");
		
		String string1= "ABACDD";//It will compare with single character and substract each return remaining value.
		String s7 = "ABAACC";//A-A=0, B-B=0, A-A=0, C-A=2 SO it will return 2;
		System.out.println(string1.compareTo(s7));
		
		System.out.println();
		System.out.println("=====substring() Method======");
		
		System.out.println(s7.substring(2));
		System.out.println(s7.substring(2,4));
		
		System.out.println();
		System.out.println("=====concat() Method======");
		
		String h="Hello";
		System.out.println(h);
		h=h.concat(" Good").concat(" morning");
		System.out.println(h);
		
		System.out.println();
		System.out.println("=====replace() Method======");
		
		String g="toy";
		System.out.println(g);
		System.out.println(g.replace('t','j'));
		
		System.out.println();
		System.out.println("=====replaceFirst() Method======");
		
		String st="hello.in";
		System.out.println(st);
		String st1=st.replaceFirst("in","net");
		System.out.println(st1);
		
		/*System.out.println();
		System.out.println("=====replaceAll() Method======");
		*/
		System.out.println();
		System.out.println("=====indexOf() Method======");
		String ss2="WelcomAll";
		System.out.println(ss2.indexOf('e'));
		
		System.out.println();
		System.out.println("=====indexOf() Method======");
		System.out.println("s1.indexOf(\"com\") : "+s1.indexOf("com"));
		
		System.out.println();
		System.out.println("=====indexOf(char ch,int fromIndex)Method======");
		
		System.out.println();
		System.out.println("=====boolean contains()Method=============");// will return true or false only
		
		String r="Renuka jadhav";
		System.out.println(r.contains("jadhav"));//true
		System.out.println(r.contains("jdav"));//false
		
		System.out.println();
		System.out.println("===== isEmpty()Method=============");// will return true or false only
		
		String r1="e";
		System.out.println(r1.isEmpty());//false
		
		String rr1=" ";
		System.out.println(rr1.isEmpty());//false
		
		String rr="";
		System.out.println(rr.isEmpty());//true
		
	
		System.out.println();
		System.out.println("===== String.join()Method=============");
		
		System.out.println(String.join("/","13","10","2022"));//13/10/2022
		System.out.println(String.join("-","13","10","2022"));//13-10-2022
	
		System.out.println();
		System.out.println("================split()Method===================");
		
		String ren = new String("30/08/2022");
		String array1[] = ren.split("/");
		for(String x:array1)
		{
			System.out.print(x+"	");
		}
		System.out.println();
		
		String array2[] = ren.split("/",3);
		for(String y:array2)
		{
			System.out.print(y);
		}
		System.out.println();
		
		
		
		System.out.println();
		System.out.println("================formate()Method===================");
		
	}
}

/*
System.out.println("s1.charAt(0) => "+s1.charAt(0)); //ok
System.out.println("s1.charAt(0) => "+s1[0]);//error

Q. Print the number of occurences of each character in a given string.

Welcome
w - 1
e - 2
l - 1
c - 1
o - 1
m - 1

Q. abccaab


String str9 ="Welcome";

"Welcome".substring(3); would return "come" //it will print from index 3 to last index.
"Welcome".substring(3,5); // would return "co" from index 3 to index 5-1;

posible substrings of string in continue order only.

-- Continue characters we have to pick for substring.
eg. wlc is not a substring of "Welcome".


st=hello.in;
st1=str.replaceFirst("in","net") 
st1=hello.com
====================================
join is a static method

String.join("/","13","10","2022");
=================================
task==>>

enter any string = Rajkumar sinha
enter substring to search = kumar
yes found
if not then print : no



java String Formate Specifiers
String star= "Just a String";

String f=String.formate("My String is %s", star)

String f=String.formate("%5d", star);

String


*/