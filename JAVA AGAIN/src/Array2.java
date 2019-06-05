///******THIS CODE IS FOR FINDING THE DUPLICATE ELEMENT  *****///////////
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={2,3,5,6,7,8,2};
		int count = 0;
		int Value =2;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==Value)
			{
				count = count+1;
			
			}
			
		}
		
		
		System.out.println("Value is present" + "  " +count + "times");
		
		
		
	}

}
