package SortingAlgorithams;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]={2,7,1,3,11,8,14,-1};
		int temp ;
		for (int i =0;i<arr.length;i++){
			for (int j =0;j<arr.length-1;j++){
				
				if(arr[j]>arr[j+1]){
					     temp =arr[j];
					     arr[j]=arr[j+1];
					     arr[j+1] =temp;
				}	
			}	
		}
		
		for (int z : arr){
			System.out.print(z);
			System.out.print(" ");
				}
	}

}
