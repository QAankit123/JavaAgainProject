package InQ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class practise {

	public static void main(String[] args) {
	
	//int [] arr= {3,4,6,8,22,24,100,-4,5,101};
	int [] arr= {10,5,6,2,4};
	//else if(arr[i]>s_largest) s_largest=arr[i]
	int first_largest= arr[0];
	int second_largest= arr[0];
	
	for(int i =0;i<arr.length;i++){
		
		if(arr[i]>first_largest){
			
			
			second_largest=first_largest;
			
			first_largest = arr[i];
			
		}
		
		else if(arr[i]>second_largest){
			second_largest = arr[i];
		}
	
	}
	System.out.println("Second largest element in array is " + "    "+second_largest );
	System.out.println("First largest element in array is " + "    "+first_largest );
		
	
		
		
		
		
		
		
		
		
		

}
}