package InQ;

public class MargeOFTwoArrayInToNew {

	public static void main(String[] args) {
		

		int arr1[]={2,4,5,6,7};
		int arr2[]={7,5,3,9,0};
		int merge[]=new int[arr1.length+arr2.length];
		int count =0;
		
		for (int i=0;i<arr1.length;i++)
		{
			merge[i]=arr1[i];
			count++;
		}
		for (int j=0;j<arr2.length;j++){
			
			          merge[count++]=arr2[j];
		}
		
	 
		
		
		 for(int k=0;k<merge.length;k++){
			 System.out.print(merge[k]);
			
		 }
		
		
		
		
		
		
		
	}

}
