package InQ;

public class LargestInArray {

	public static void main(String[] args) {
		
		int arr[]={8,2,4,5,7,88,66};
		int largest =arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest){
			   largest=arr[i];	
				
				
			}
			
			
			
		}
		 System.out.println(largest);
		
		
		

	}

}
