import java.util.Scanner;
public class Q_6 {
	static String getPalindrome(String s) {
		String palindrome="";
		for(int i=(s.length()-1);i>=0;i--) {
			palindrome+=s.charAt(i);
		}
		return palindrome;
		
	}
	static boolean isPalindrome(String str) {
		String res = "";
		for(int i=(str.length()-1);i>=0;i--) {
			res+=str.charAt(i);
		}
		//System.out.println(res);
		if(str.equals(res))
			return true;
		else {
			int count=0;
			for(int a=0;a<res.length();a++) {
				String resmod ="";
				
				for(int i=0;i<res.length();i++) {
					if(i==a)
						continue;
					resmod+=res.charAt(i);
					
				}
				if(resmod.equals(getPalindrome(resmod))) {
					
					return true;
				}
				
			}
			
			
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.next();
		boolean result = isPalindrome(s);
		System.out.println("OUTPUT: "+result);
	}
}