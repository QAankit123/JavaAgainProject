package InQ;

public class SmallestElementINArray {

	public static void main(String[] args) {
		int arr []= {90,2,8,1,79,9,-6,99,5,100};
		
		int small = arr[0];
		
		for (int i =0;i<arr.length;i++){
			
			
			if(arr[i]<small){
				   small=arr[i];
			}
		}
		System.out.println(small);
	}

}
