package InQ;

public class CopyOfArray {

	public static void main(String[] args) {
		
		int arr1[]={8,2,4,5,7,88,66};
		int arr2[]=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			
			        arr2[i]=arr1[i];
		}
		
       for(int a :arr2){
    	   System.out.println(a);
       }
	}

}
