//String Constructor Program in Java
class Q_20
{
	public static void main(String args[])
	{
		byte[] ascii = {10,20,30,40,50};
		String str = "Hello";
		String str1 = new String("Renuka_Jadhav");
		String str2 = new String("Welcome");
		String str3 = new String(ascii);
		String str4 = new String(ascii,1,3);
		String str5 = new String();
		
		System.out.println("str : " + str);
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		System.out.println("str5 : " + str5);
		
	}
}