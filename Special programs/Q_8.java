
/*

output:
String1: abc
String2: def
OUTPUT: adbecf

*/
import java.util.Scanner;
class Q_8{
	static String getCombination(String s1,String s2){
		String small;
		String large;
		String result = "";
		if(s1.length()>s2.length())
			small = s2;
		else
			small = s1;
		if(small==s1)
			large=s2;
		else
			large=s1;
		for(int i=0;i<small.length();i++){
			char ch = small.charAt(i);
			result+= ch;
			for(int j=i;j<=i;j++){
				char ch2=large.charAt(j);
				result +=ch2;
			}
		}
		for(int i=small.length();i<large.length();i++){
			char ch3 = large.charAt(i);
			result+=ch3;
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("String1: ");
		String s1 = sc.next();
		System.out.print("String2: ");
		String s2 = sc.next();
		String output = getCombination(s1,s2);
		System.out.println("OUTPUT: "+output);
		
	}
	
	
}