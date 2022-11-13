import java.util.Scanner;
class Q_5{
	static int preLength=0;
	
	static int  insertValues(String[] s,int n,Scanner sc){
		int index=0;
		for(int i=0;i<n;i++){
			System.out.print("Enter string: ");
			String str = sc.next();
			s[i] = str;
			if(preLength<s[i].length() && preLength==0){
				preLength=s[i].length();
				index = i;
			}
			
			if(preLength!=0 && preLength>s[i].length()){
				preLength=s[i].length();
				index=i;
			}
		}
		return index;
	}
	static String getPrefix(String[] s,int index){
		String res="";
		char dum=' ';
		for(int i=0;i<s[index].length();i++){
			char ch1=s[index].charAt(i);
			dum=' ';
			for(int j=0;j<s.length;j++){
				if(j==index)
					continue;
				if(s[j].charAt(i)==ch1){
					dum=s[j].charAt(i);
					continue;
				}
				
			}
			res +=dum;
		}
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of strings: ");
		int size = sc.nextInt();
		String[] arr = new String[size];
		int index = insertValues(arr,size,sc);
		System.out.println("Index = "+index);
		String result = getPrefix(arr,index);
		System.out.println("Longest common prefix: "+result);
		
	}
}