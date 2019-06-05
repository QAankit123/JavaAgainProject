package InQ;

public class QA {

	public static void main(String[] args) {
		
		
		int arr1[]= {2,4,5,7,9,0};
		int arr2[]={5,7,8,0,3,4,7};
		int count = 0;
		int arr3[]= new int[arr1.length+arr2.length];
		
		for (int i =0;i<arr1.length;i++){
			
			        arr3[i]=arr1[i];
			        count++;
		}
		
		    for(int j =0;j<arr2.length;j++){
		    	
		    	     arr3[count++]=arr2[j];
		    }
		    
		   for(int k :arr3){
			   System.out.print(k);
			
		   }
	}

}
