class Q_6
{
	public static void main(String args[])
	{
		int arr[] = {24,54,31,16,82,45,67};
		
		int size = arr.length;
   
		for(int i = 0; i<size; i++ ){
		for(int j = i+1; j<size; j++){
         if(arr[i]>arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         }
      }
   }
   System.out.println("Third largest number is : "+arr[size-3]);
   
	}
}