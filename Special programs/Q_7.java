/*

output:
Jewels = Af
Stones = AaaddFf
OUTPUT: 2

*/

import java.util.Scanner;
class Q_7
{
	static int getCount(String s1,String s2){
		int count=0;
		for(int i=0;i<s1.length();i++){
			char ch1=s1.charAt(i);
			for(int j=0;j<s2.length();j++){
				char ch2= s2.charAt(j);
				if(ch1==ch2){
					count++;
				}
			}
			
		}
		return count;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Jewels = ");
		String jewels = sc.next();
		System.out.print("Stones = ");
		String stones = sc.next();
		int match = getCount(stones,jewels);
		System.out.println("OUTPUT: "+match);
	}
}