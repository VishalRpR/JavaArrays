
public class memoryArray {
/*
	public static void main(String[] args) {

			
			   int[] arr;
			   arr=new int[5];
			   arr[0]=54;
			   arr[1]=77;
			   arr[2]=87;
			   arr[3]=65;
			   arr[4]=43;
			   
			   
			   int [] two=arr;
			   two[2]=870;
			   
			   
			   //for arr and two same output
			   
		        for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
		

			}
		        
		        for (int i = 0; i < two.length; i++) {
					System.out.println(two[i]);
		

			}



	}
	*/
	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	public static void main(String[] args) {

		
		   int[] arr;
		   arr=new int[5];
		   arr[0]=54;
		   arr[1]=77;
		   arr[2]=87;
		   arr[3]=65;
		   arr[4]=43;
		   
		swap(arr,0,4);
         for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}


}

}
