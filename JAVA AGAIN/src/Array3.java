
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]={2,3,5,6,7,8,2,3};
		int count = 0;
		
		for(int i =0;i<arr.length;i++)
		{
			
			for(int j=i;j<=i;j++)
			{
				if(arr[i]==count)
				{
					count=count+1;
				
				}
				System.out.println(arr[i] + "  " + "IS PRESENT IN ARRAY" + count + "TIME" );
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
